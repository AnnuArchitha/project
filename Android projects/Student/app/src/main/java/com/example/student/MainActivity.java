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

public class MainActivity extends AppCompatActivity {
    //EditText rollno2, email2, name2, phone2, sec2;
    DataBase d;
    Button  get, add,viewall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d=new DataBase(this);
        add=(Button)findViewById(R.id.add);
        viewall=findViewById(R.id.viewall);
get=findViewById(R.id.viewbyroll);

        add();
        get();
        viewall();

    }

    void add() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


    void get() {
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }

   void  viewall() {
        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor=d.getAllData();
                if(cursor.getCount()==0){
                    showmessage1("Error","Nothing is there in database");
                    return;
                }
                StringBuilder buffer=new StringBuilder();
                while(cursor.moveToNext()){
                    buffer.append("Rollno: "+cursor.getString(0)+"\n");
                    buffer.append("Name: " + cursor.getString(1) + "\n");
                    buffer.append("Section: " + cursor.getString(2) + "\n");
                    buffer.append("Email: " + cursor.getString(3) + "\n");
                    buffer.append("Phoneno: " + cursor.getString(4) + "\n\n");
                }
                showmessage1("All Data",buffer.toString());

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

    public void update(View view) {
        Intent intent=new Intent(this,SixthActivity.class);
        startActivity(intent);
        finish();
    }

    public void viewbysec(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
        finish();

    }

    public void deletedata(View view) {
        Intent intent=new Intent(this,EightActivity.class);
        startActivity(intent);
        finish();
    }

    public void deleteall(View view) {
        Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
        startActivity(intent);
        finish();
    }
}

