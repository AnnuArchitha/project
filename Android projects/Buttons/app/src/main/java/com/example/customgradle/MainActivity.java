package com.example.customgradle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){
        switch (view.getId()){
            case R.id.errorButton:
                Toasty.error(this,"login failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successButton:
                Toasty.success(this,"successfully done", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this,"information is needed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this,"enter details correctly", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this,"upload is done",Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_beach)).show();
                break;

        }
    }
}
