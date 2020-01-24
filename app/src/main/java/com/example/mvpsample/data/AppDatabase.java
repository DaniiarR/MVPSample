package com.example.mvpsample.data;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class AppDatabase extends RoomDatabase {

    public static AppDatabase INSTANCE;
    public abstract RoomService roomService();

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "appDatabase")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }

}
