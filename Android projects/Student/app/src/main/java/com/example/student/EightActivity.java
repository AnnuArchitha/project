package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EightActivity extends AppCompatActivity {
 EditText e1,e2;
 Button b;
 DataBase d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        e1=findViewById(R.id.roll);
        e2=findViewById(R.id.password);
        d=new DataBase(this);
        b=findViewById(R.id.delete);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3=e2.getText().toString();
                String s= e1.getText().toString();
                String s1=s.toUpperCase();
                if(s.equals(" ")||s3.equals((" "))){
                    Toast.makeText(EightActivity.this,"Enter above details",Toast.LENGTH_SHORT).show();
                }
                else {
                    if (s3.equals("sphoorthy")) {
                        Integer i = d.deleteData(s1);
                        if (i > 0) {
                            Toast.makeText(EightActivity.this, "Deleted successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(EightActivity.this, "Rollno is not present in database", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(EightActivity.this,"Wrong password",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }

    public void back(View view) {
        Intent intent=new Intent(EightActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
