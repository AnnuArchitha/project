package com.example.animationlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
        AnimationDrawable anidraw=(AnimationDrawable)layout.getBackground();
        anidraw.setEnterFadeDuration(2000);
        anidraw.setExitFadeDuration(4000);
        anidraw.start();
    }
}
