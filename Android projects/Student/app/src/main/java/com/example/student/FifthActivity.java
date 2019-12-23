package com.example.student;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {
EditText rollno2;
DataBase d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        rollno2=findViewById(R.id.editText);
        d=new DataBase(this);
    }

    public void getdata(View view) {
        String id = rollno2.getText().toString();
        String rs=id.toUpperCase();
        if (id.equals(String.valueOf(" "))) {


            Toast.makeText(FifthActivity.this,"Enter Rollno", Toast.LENGTH_SHORT).show();

        } else {
            Cursor cursor = d.getData(rs);
            String data = null;
            if (cursor.moveToNext()) {
                data = "Rollno : " + cursor.getString(0) + "\n" +
                        "Name : " + cursor.getString(1) + "\n" +
                        "Section : " + cursor.getString(2) + "\n" +
                        "Email : " + cursor.getString(3) + "\n" +
                        "Phoneno : " + cursor.getString(4) + "\n\n";
                showmessage1("Data : " + "\n", data);
            }
            else{
                showmessage1("Data : " + "\n","Not Exist in the Database");
            }}
    }
    private void showmessage1(String title, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.show();

    }

    public void back9(View view) {
        Intent intent=new Intent(FifthActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
