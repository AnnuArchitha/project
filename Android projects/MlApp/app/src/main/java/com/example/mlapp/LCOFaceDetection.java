package com.example.mlapp;

import android.app.Application;

import com.google.firebase.FirebaseApp;

class LCOFaceDetection extends Application {
    public static final String Result_Text="RESUIT_TEXT";
    public static final String Result_Dialog="RESUIT_DIALOG";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
