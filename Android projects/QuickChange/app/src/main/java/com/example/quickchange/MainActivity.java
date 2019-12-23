package com.example.quickchange;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RadioGroup r;
    RelativeLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=findViewById(R.id.rgroup);
        lay=findViewById(R.id.layout);
        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.blue:
                        lay.setBackgroundColor(Color.parseColor("#4834DF"));
                        break;
                    case R.id.green:
                        lay.setBackgroundColor(Color.parseColor("#45CE30"));
                        break;
                    case R.id.orange:
                        lay.setBackgroundColor(Color.parseColor("#ffff8800"));
                        break;
                    case R.id.skyblue:
                        lay.setBackgroundColor(Color.parseColor("#53E0BC"));
                        break;
                    case R.id.yellow:
                        lay.setBackgroundColor(Color.parseColor("#FFF222"));
                        break;
                    case R.id.red:
                        lay.setBackgroundColor(Color.parseColor("#FF3031"));
                        break;
                    case R.id.purple:
                        lay.setBackgroundColor(Color.parseColor("#30336B"));
                        break;


                }
            }
        });
    }
}
