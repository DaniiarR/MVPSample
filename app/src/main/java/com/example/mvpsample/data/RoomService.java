package com.example.mvpsample.data;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.mvpsample.models.User;

@Dao
public interface RoomService {

    @Insert
    void insertUser(User user);
}
