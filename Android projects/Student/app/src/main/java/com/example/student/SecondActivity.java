package com.example.student;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
EditText e1;
Button getsec;
DataBase dbsp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

 super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_second);
         dbsp =new DataBase(this);
         e1 = findViewById(R.id.editsec);
         getsec=findViewById(R.id.getsec);
         getData();
         }

public void getData() {
        getsec.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
    String sec=e1.getText().toString();
    if (sec.equals(String.valueOf(" "))) {
        Toast.makeText(SecondActivity.this,"Enter Section",Toast.LENGTH_SHORT).show();
        return;
    }
    String sec1=sec.toUpperCase();

    Cursor cursor = dbsp.getDataSec(sec1);
    StringBuffer buffer = new StringBuffer();
    if(cursor.getCount()==0){
        showmessage1("Error","nothing is found in database");
        return;
    }
    while (cursor.moveToNext()) {
        buffer.append("Rollno: " + cursor.getString(0) + "\n");
        buffer.append("Name: " + cursor.getString(1) + "\n");
        buffer.append("Section: " + cursor.getString(2) + "\n");
        buffer.append("Email: " + cursor.getString(3) + "\n");
        buffer.append("Phoneno: " + cursor.getString(4) + "\n\n");
    }
    showmessage1("Section Data",buffer.toString());
        }
        });
        }


     private void showmessage1(String title, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.show();

        }

    public void back(View view) {
        Intent intent=new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
    }
}