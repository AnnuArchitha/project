package com.example.pachisgameroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private ImageView imageviewpac;
MediaPlayer m1;
private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageviewpac = findViewById(R.id.imageView6);
        m1=MediaPlayer.create(this,R.raw.two);

    }

    public void event(View view) {
        rollpachis();

    }
    void rollpachis(){
        int num= random.nextInt(8)+1;
        switch(num){
            case 1:
                m1.start();
                imageviewpac.setImageResource(R.drawable.das);
                showtoast("Das");
                break;
            case 2:
                m1.start();
                imageviewpac.setImageResource(R.drawable.dhuga);
                showtoast("Dhuga");
                break;
            case 3:
                m1.start();
                imageviewpac.setImageResource(R.drawable.theen);
                showtoast("Theen");
                break;
            case 4:
                m1.start();
                imageviewpac.setImageResource(R.drawable.chaar);
                showtoast("Chaar");
                break;
            case 5:
                m1.start();
                imageviewpac.setImageResource(R.drawable.pachisi);
                showtoast("Pachis");

                break;
            case 6:
                m1.start();
                imageviewpac.setImageResource(R.drawable.thees);
                showtoast("Thees");

                break;
            case 7:
                m1.start();
                imageviewpac.setImageResource(R.drawable.chaudah);
                showtoast("Chaudah");

                break;
            case 8:
                m1.start();
                imageviewpac.setImageResource(R.drawable.chakka);
                showtoast("Chakka");

                break;
        }

    }
    void showtoast(String str){
        LayoutInflater inflate = getLayoutInflater();
        View layout= inflate.inflate(R.layout.toast_layout,(ViewGroup)findViewById(R.id.layout));
        TextView toast = layout.findViewById(R.id.toasttext);
        toast.setText(str);
        Toast t = new Toast(getApplicationContext());
        t.setGravity(Gravity.BOTTOM,0,0);
        t.setDuration(Toast.LENGTH_SHORT);
        t.setView(layout);
        t.show();

    }
}
