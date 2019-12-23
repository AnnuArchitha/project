package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
    EditText rollno2,email2,name2,phone2,sec2;
    DataBase d;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        rollno2 = findViewById(R.id.rollno);
        email2 = findViewById(R.id.email);
        name2 = findViewById(R.id.name);
        phone2 = findViewById(R.id.phoneno);
        sec2 = findViewById(R.id.section);
        b = findViewById(R.id.add);

        d = new DataBase(this);
    }

    public void addvalue(View view) {
        String r = rollno2.getText().toString();
        String n = name2.getText().toString();
        String e = email2.getText().toString();
        String s = sec2.getText().toString();
        String p = phone2.getText().toString();
        String sp=r.toUpperCase();
        if (sp.equals(String.valueOf("")) || n.equals(String.valueOf("")) || e.equals(String.valueOf("")) || p.equals(String.valueOf("")) || s.equals(String.valueOf(""))) {
            Toast.makeText(FourthActivity.this, "Enter all the above details", Toast.LENGTH_SHORT).show();
            ;
        } else {
            boolean b = d.insertData(sp, n, s, e, p);
            if (b==true) {
                Toast.makeText(FourthActivity.this, "added successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(FourthActivity.this, "Already Exist", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void back(View view) {
        Intent intent=new Intent(FourthActivity.this,MainActivity.class);

        startActivity(intent);
    }
}
