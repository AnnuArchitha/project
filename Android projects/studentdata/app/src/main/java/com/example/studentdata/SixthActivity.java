package com.example.studentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {
    EditText ee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        ee = findViewById(R.id.e);
    }

    public void update(View view) {
        String s = ee.getText().toString();

        if (s.equals("")) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        } else {
            if (s.equals("sphoorthy")) {
                Intent intent = new Intent(SixthActivity.this, FifthActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(this, "WrongPassword", Toast.LENGTH_SHORT).show();
            }
        }
    }
}