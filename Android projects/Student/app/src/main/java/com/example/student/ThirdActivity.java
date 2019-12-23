package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
DataBase d;
EditText p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d= new DataBase(this);
        setContentView(R.layout.activity_third);
        p=findViewById(R.id.password);
    }

    public void delete(View view) {
        String pass= p.getText().toString();
        if(p.equals("")){
            Toast.makeText(this,"Enter password",Toast.LENGTH_SHORT).show();
        }
        else if(pass.equals("sphoorthy")){
            Integer i = d.deleteAll();
            if (i > 0) {
                Toast.makeText(ThirdActivity.this, "Deleted successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(ThirdActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this,"wrong password",Toast.LENGTH_SHORT).show();

        }

    }

    public void back(View view) {
        Intent intent=new Intent(ThirdActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
