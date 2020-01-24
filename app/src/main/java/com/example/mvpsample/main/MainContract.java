package com.example.mvpsample.main;

public interface MainContract {

    interface Presenter {
        boolean validateInputs(String name, String email);
        void insertUser();
    }

    interface View {
        void sendInputs();
        void showNameAndEmail(String name, String email);
        void initViews();
    }

}
