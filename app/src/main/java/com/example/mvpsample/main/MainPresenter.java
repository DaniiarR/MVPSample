package com.example.mvpsample.main;

import android.content.Context;

import com.example.mvpsample.data.AppDatabase;
import com.example.mvpsample.models.User;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;
    Context context;
    AppDatabase database = AppDatabase.getInstance(context);

    public MainPresenter(MainContract.View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public boolean validateInputs(String name, String email) {
        if (name != null && email != null) {
            view.showNameAndEmail(name, email);
            User user = new User(name, email);
            database.roomService().insertUser(user);
            // send data to the server
            return true;
        }
        return false;

    }

    @Override
    public void insertUser() {

    }
}
