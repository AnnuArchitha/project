package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        e1 = findViewById(R.id.e3);
        e2 = findViewById(R.id.e4);
        e3 = findViewById(R.id.e5);
        e4 = findViewById(R.id.e6);

    }

    public void clicked(View view) {
        String name= e1.getText().toString();
        String password = e2.getText().toString();
        String phone= e3.getText().toString();
        String email= e4.getText().toString();
        if((name.equals(""))||(password.equals(""))||(phone.equals(""))||(email.equals(""))) {
            Toast.makeText(this, "Enter all the above details", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Successfully Signed",Toast.LENGTH_SHORT).show();
            Intent intent1=new Intent(ThirdActivity.this,MainActivity.class);
            intent1.putExtra("name",name);
            intent1.putExtra("password",password);
            startActivity(intent1);
            finish();


        }
    }
}