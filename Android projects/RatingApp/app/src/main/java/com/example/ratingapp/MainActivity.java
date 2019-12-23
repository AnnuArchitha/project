package com.example.ratingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView t1;
    RatingBar r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView);
        r1 = findViewById(R.id.ratingBar);
    }

    public void submitted(View view) {
        float value = r1.getRating();
        if (value <= 2) {

            t1.setText("Rating : " + value + " I will try to post better one" );
        } else if (value >= 3 && value <= 4) {
            t1.setText("Rating : " + value +" I will make as beautiful");

        } else if (value >= 5 ) {
            t1.setText("Rating : " + value + " Thank You");


        }
    }
}
