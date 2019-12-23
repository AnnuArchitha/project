package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);

    }

    public void logined(View view) {
        String name = e1.getText().toString();
        String password = e2.getText().toString();
        String s1 = getIntent().getExtras().getString("name");
        String s2 = getIntent().getExtras().getString("password");
        if (name.equals(s1) && password.equals(s2)) {
            Toast.makeText(this, "successfully logined", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        } else if (name.equals("") || password.equals("")) {
            Toast.makeText(this, "Enter username and password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "login failed Enter valid name or password", Toast.LENGTH_SHORT).show();
        }



    }

    public void signup(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}