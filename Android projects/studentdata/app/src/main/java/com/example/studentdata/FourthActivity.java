package com.example.studentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {
 Button b;
 EditText e;
 DatabaseHelperFile d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        e=findViewById(R.id.editText2);
        b=findViewById(R.id.button);
        d=new DatabaseHelperFile(this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r=e.getText().toString();
                if(r.equals(String.valueOf(" "))){
                    Toast.makeText(FourthActivity.this,"Enter Rollno",Toast.LENGTH_SHORT).show();
                }
                else {
                    Integer i = d.deleteData(r);
                    if (i > 0) {
                        Toast.makeText(FourthActivity.this, "Deleted successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(FourthActivity.this, "Rollno is not present in database", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}
