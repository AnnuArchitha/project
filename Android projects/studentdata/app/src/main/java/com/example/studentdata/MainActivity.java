package com.example.studentdata;

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
   DatabaseHelperFile dbs;
   EditText rollno,name,section,email,phoneno;
   Button add,viewbysec,viewbyrollno,delete,update,viewall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbs=new DatabaseHelperFile(this);

        add=findViewById(R.id.add);
        viewbysec =findViewById(R.id.viewbysec);
        viewbyrollno =findViewById(R.id.viewbyroll);
        update =findViewById(R.id.update);
        delete =findViewById(R.id.delete);
        viewall =findViewById(R.id.viewAll);
        addData();
        viewBySec();
        viewByRoll();
        showall();
        deletedata();
        updatedata();



    }
    private void showmessage(String title,String msg){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.show();

    }
    public void addData(){
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SeventhActivity.class);

                startActivity(intent);
                finish();
            }
        });
    }
    public void viewBySec(){
        viewbysec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void viewByRoll(){
      viewbyrollno.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


              Intent intent=new Intent(MainActivity.this,SecondActivity.class);

              startActivity(intent);
              finish();
          }
      });

    }
    public void showall(){
        viewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor=dbs.getAllData();
                if(cursor.getCount()==0){
                    showmessage("Error","Nothing is there in database");
                     return;
                }
                StringBuffer buffer=new StringBuffer();
                while(cursor.moveToNext()){
                    buffer.append("Rollno: "+cursor.getString(0)+"\n");
                    buffer.append("Name: " + cursor.getString(1) + "\n");
                    buffer.append("Section: " + cursor.getString(2) + "\n");
                    buffer.append("Email: " + cursor.getString(3) + "\n");
                    buffer.append("Phoneno: " + cursor.getString(4) + "\n\n");
                }
                showmessage("All Data",buffer.toString());
            }
        });
    }
    public void deletedata(){
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FourthActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void updatedata(){
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(MainActivity.this,SixthActivity.class);
               startActivity(intent);
               finish();
            }
        });

    }

}
