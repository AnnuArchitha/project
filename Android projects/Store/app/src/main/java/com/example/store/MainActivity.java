package com.example.store;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
  FirebaseDatabase db=FirebaseDatabase.getInstance();
  DatabaseReference rootRef=db.getReference();

    DatabaseReference userRef=rootRef.child("Users");
    EditText name,phone,email;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
                phone=findViewById(R.id.phone);
                email=findViewById(R.id.email);
                button=findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name1=name.getText().toString().trim();
                        String phone1=phone.getText().toString().trim();
                        String email1=email.getText().toString().trim();
                        HashMap<String,String> usermap=new HashMap<String, String>();
                        usermap.put("Name",name1);
                        usermap.put("Phone",phone1);
                        usermap.put("Email",email1);
                        userRef.push().setValue(usermap).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(MainActivity.this,"successfull",Toast.LENGTH_SHORT);
                                }
                                else{
                                    Toast.makeText(MainActivity.this,"went wrong",Toast.LENGTH_SHORT);
                                }
                            }
                        });
                    }
                });
    }

}
