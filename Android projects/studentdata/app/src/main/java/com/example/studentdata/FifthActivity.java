package com.example.studentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {
    DatabaseHelperFile ds;
    Button d;
    EditText name,rollno,phoneno,email,sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        d=findViewById(R.id.button2);
        ds=new DatabaseHelperFile(this);
        name=findViewById(R.id.name1);
        rollno=findViewById(R.id.rollno1);
        sec=findViewById(R.id.section1);
        email=findViewById(R.id.email1);
        phoneno=findViewById(R.id.phonenumber1);
    }


    public void update(View view) {
        String sr=rollno.getText().toString();
        String sss=sr.toUpperCase();
        String se=email.getText().toString();
        String sp=phoneno.getText().toString();
        String ss= sec.getText().toString();
        String sn=name.getText().toString();
        if(sr.equals(String.valueOf(""))||sn.equals(String.valueOf(""))||ss.equals(String.valueOf(""))||se.equals(String.valueOf(""))||sp.equals(String.valueOf(""))){
            Toast.makeText(FifthActivity.this,"Enter all the above details",Toast.LENGTH_SHORT).show();

        }else{
        boolean update=ds.updateData(sss,sn,ss,se,sp);
        if(update==true){
            Toast.makeText(FifthActivity.this,"updated successfully",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(FifthActivity.this,"not updated",Toast.LENGTH_SHORT).show();
        }

    }}
}
