package com.example.studentdata;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    DatabaseHelperFile dbsp;
    EditText e1;
    Button get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        dbsp =new DatabaseHelperFile(this);
        e1 = findViewById(R.id.editText);
        get=findViewById(R.id.get);
        getData();
    }

    public void getData() {
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = e1.getText().toString();
                if (id.equals(String.valueOf(" "))) {


                    Toast.makeText(SecondActivity.this,"Enter Rollno", Toast.LENGTH_SHORT).show();

                } else {
                    Cursor cursor = dbsp.getData(id);
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
}