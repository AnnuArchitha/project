package com.example.studentdata;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
EditText e2;
Button getdata;
DatabaseHelperFile dbsa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        e2=findViewById(R.id.sec);
        getdata=findViewById(R.id.getdata);
        dbsa=new DatabaseHelperFile(this);
        gett();
    }
    public void gett(){
        getdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sec=e2.getText().toString();
                if (sec.equals(String.valueOf(" "))) {
                    Toast.makeText(ThirdActivity.this,"Enter Section",Toast.LENGTH_SHORT).show();
                                return;
                            }
                              String sec1=sec.toUpperCase();

                            Cursor cursor = dbsa.getDataSec(sec1);
                            StringBuffer buffer = new StringBuffer();
                            if(cursor.getCount()==0){
                                showmessage("Error","nothing is found in database");
                                return;
                            }
                            while (cursor.moveToNext()) {
                                buffer.append("Rollno: " + cursor.getString(0) + "\n");
                                buffer.append("Name: " + cursor.getString(1) + "\n");
                                buffer.append("Section: " + cursor.getString(2) + "\n");
                                buffer.append("Email: " + cursor.getString(3) + "\n");
                                buffer.append("Phoneno: " + cursor.getString(4) + "\n\n");
                            }
                            showmessage("Section Data",buffer.toString());
                        }

        });

    }
    private void showmessage(String title,String msg){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.show();

    }

}
