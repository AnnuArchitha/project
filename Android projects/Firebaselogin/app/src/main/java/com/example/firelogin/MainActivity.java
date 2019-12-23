package com.example.firelogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
EditText e1;
EditText e2;
    private FirebaseAuth mAuth;
Button b1;

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e2=findViewById(R.id.pass);
        e1=findViewById(R.id.email);
        b1=findViewById(R.id.button);

        mAuth = FirebaseAuth.getInstance();




    }

    public void onRegister(View view) {
       final String email=e1.getText().toString();
        final String pass=e2.getText().toString();
        if(email.equals("null")||email.equals(" ")){
            e1.setError("Enter valid email id");
        }
        if(pass.equals(" ")|| pass.equals("null")){
            e2.setError("Enter valid Password");
        }
            mAuth.createUserWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.i("tag", "createUserWithEmail:success");
                                Toast.makeText(MainActivity.this, " Already In",
                                        Toast.LENGTH_SHORT).show();

                            } else {
                                // If sign in fails, display a message to the user.

                                Toast.makeText(MainActivity.this, " failed.",
                                        Toast.LENGTH_SHORT).show();

                            }

                            // ...
                        }
                    });

    }

    public void login(View view) {
        final String email=e1.getText().toString();
        final String pass=e2.getText().toString();
        if(email.equals("null")||email.equals(" ")){
            e1.setError("Enter valid email id");
        }
        if(pass.equals(" ")|| pass.equals("null")){
            e2.setError("Enter valid Password");
        }
        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful()){
                   Log.i("Tag","signInWithEmail:Success");
                   FirebaseUser user =mAuth.getCurrentUser();
                   String userId=user.getUid().toString();
                   Toast.makeText(MainActivity.this,"login successfull",Toast.LENGTH_SHORT).show();
                   Log.i("USER","USER"+ user.toString());
                   Log.i("USER","USER"+ userId);
               }else{
                   Log.i("Tag","SignInWithEmail",task.getException());
                   Toast.makeText(MainActivity.this,"AuthFailed",Toast.LENGTH_SHORT).show();
               }
            }
        });
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        Toast.makeText(this,"Signout",Toast.LENGTH_SHORT).show();

    }
}
