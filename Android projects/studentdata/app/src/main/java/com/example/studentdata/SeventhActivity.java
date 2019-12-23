package com.example.studentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SeventhActivity extends AppCompatActivity {
DatabaseHelperFile d;
Button b;
EditText rollno2,email2,phone2,sec2,name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        rollno2 =findViewById(R.id.rollno2);
        email2=findViewById(R.id.email2);
        name2=findViewById(R.id.name2);
        phone2=findViewById(R.id.phonenumber2);
        sec2=findViewById(R.id.section2);
        b=findViewById(R.id.add2);
        d= new DatabaseHelperFile(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r=rollno2.getText().toString();
                String n=name2.getText().toString();
                String e=email2.getText().toString();
                String s=sec2.getText().toString();
                String p=phone2.getText().toString();
                if(r.equals(String.valueOf(""))||n.equals(String.valueOf(""))||e.equals(String.valueOf(""))||p.equals(String.valueOf(""))||s.equals(String.valueOf(""))){
                    Toast.makeText(SeventhActivity.this,"Enter all the above details",Toast.LENGTH_SHORT).show();;
                }
                else{
                boolean b=d.insertData(r,n,s,e,p);
                if(b==true){
                    Toast.makeText(SeventhActivity.this,"added successfully",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SeventhActivity.this,"some thing went wrong",Toast.LENGTH_SHORT).show();
                }
            }}
        });

    }
}
