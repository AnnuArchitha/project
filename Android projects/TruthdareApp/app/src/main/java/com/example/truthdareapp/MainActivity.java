package com.example.truthdareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView img;
    private int lastDirection;
    private Random random=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        img=findViewById(R.id.imageView);
    }

    public void spinner(View view) {
        int newDirection= random.nextInt(3600);
        float pivoitx = img.getWidth()/2;
        float pivoitY = img.getHeight()/2;
        Animation animation= new RotateAnimation(lastDirection,newDirection,pivoitx,pivoitY);
        animation.setDuration(2000);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                button.setEnabled(false);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setEnabled(true);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        lastDirection=newDirection;
        img.startAnimation(animation);

    }
}
