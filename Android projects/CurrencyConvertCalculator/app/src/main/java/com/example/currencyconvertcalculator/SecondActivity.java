package com.example.currencyconvertcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    String s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         s6= getIntent().getExtras().getString("name");
    }

    public void b17run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","America");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b18run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","UK");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }


    public void b19run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","Australia");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b20run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","France");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b21run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","NetherLand");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b22run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","Canada");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b23run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","Singapur");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b24run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","India");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b25run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","SwitzerLand");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b26run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","Japan");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b27run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","China");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b28run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","Germany");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b29run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","Swedan");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b30run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","HongKong");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b31run(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.putExtra("converted","Mexico");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }

    public void b32run(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("converted","UAE");
        intent.putExtra("nm",s6);
        startActivity(intent);
    }
}
