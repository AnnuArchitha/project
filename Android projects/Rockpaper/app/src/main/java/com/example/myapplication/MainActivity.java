package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    DatabaseReference gameRef =myRef.child("game");
    Button  rock;
    Button paper;
    Button scissor;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //myRef.child("game").setValue("sam");
        rock=(Button)findViewById(R.id.Rock);
        paper=(Button)findViewById(R.id.Paper);
       scissor=(Button)findViewById(R.id.Scissor);
       t=(TextView)findViewById(R.id.textView);
       rock.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
gameRef.setValue("Rock");
           }
       });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameRef.setValue("Paper");
            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameRef.setValue("Scissor");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        gameRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text=dataSnapshot.getValue().toString();
                t.setText(text);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


                Log.i("Tag","somthing went wrong");
            }
        });

    }
}
