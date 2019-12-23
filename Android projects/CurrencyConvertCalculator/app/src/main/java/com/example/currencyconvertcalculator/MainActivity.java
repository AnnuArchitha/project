package com.example.currencyconvertcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b1run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","America");
        startActivity(intent);

    }

    public void b2run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","UK");
        startActivity(intent);

    }


    public void b3run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Australia");
        startActivity(intent);
    }

    public void b4run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","France");
        startActivity(intent);
    }

    public void b5run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","NetherLand");
        startActivity(intent);
    }

    public void b6run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Canada");
        startActivity(intent);
    }

    public void b7run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Singapur");

        startActivity(intent);
    }

    public void b8run(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name","India");

        startActivity(intent);
    }

    public void b9run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","SwitzerLand");

        startActivity(intent);
    }

    public void b10run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Japan");

        startActivity(intent);
    }

    public void b11run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","China");
        startActivity(intent);
    }

    public void b12run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Germany");
        startActivity(intent);
    }

    public void b13run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Swedan");
        startActivity(intent);
    }

    public void b14run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","HongKong");
        startActivity(intent);
    }

    public void b15run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","Mexico");
        startActivity(intent);
    }

    public void b16run(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("name","UAE");
        startActivity(intent);
    }
}
