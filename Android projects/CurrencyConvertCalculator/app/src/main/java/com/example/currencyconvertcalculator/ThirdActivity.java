package com.example.currencyconvertcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ThirdActivity extends AppCompatActivity {
    TextView t1, t3;
    EditText e1;
    Button b1;
    String s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1 = findViewById(R.id.t1);
        t3 = findViewById(R.id.t3);
        e1 = findViewById(R.id.e1);
        b1 = findViewById(R.id.button);
        s1 = getIntent().getExtras().getString("nm");
        s2 = getIntent().getExtras().getString("converted");
        t1.setText(s1 + " Currency Convert in to " + s2 + " Currency");

    }

    public void getamount(View view) {
        String s3 = e1.getText().toString();
        Double n = Double.parseDouble(s3);
        if(TextUtils.isEmpty(s3)) {
            e1.setError("Empty user input");
        } else if (s1.equals("India")) {
            if(s2.equals("America")) {
                Double k = n / 68.440;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n / 85.71;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n / 47.783;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals(" France")) {
                Double k = n / 76.848;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n / 76.88;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n / 52.336;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n / 50.34;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n / 1;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n / 69.01;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n / 0.63;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n / 9.93;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n / 76.88;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n / 7.25;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n / 8.79;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ " Dollar");
            } else if (s2.equals("\n Mexico")) {
                Double k = n / 3.60;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n / 18.64;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Dirham");
            }

        } else if (s1.equals("America")) {
            if (s2.equals("America")) {
                Double k = n / 1;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n*0.80;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n*1.43;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n*0.89;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n/1.13;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n * 1.13;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n *1.13;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");

            } else if (s2.equals("India")) {
                Double k = n * 68.440;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n *0.99;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n *108.06;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n *6.89;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n*0.89;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *9.44;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *7.79;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n *19.01;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n*3.67;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

        } else if (s1.equals("UK")) {
            if (s2.equals("America")) {
                Double k = n *1.25;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n / 1;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n / 0.56;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n /0.90;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n / 0.90;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n *1.64;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(df.format(k) + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n *1.70;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n * 85.71;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n *1.24;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n *135.57;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n *8.59;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n*1.11;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *11.80;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *9.73;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n *23.55;
               //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *4.58;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dirham");
            }

        } else if (s1.equals("Australia")) {
            if (s2.equals("America")) {
                Double k =  n *0.69;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k =  n *0.56;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n / 1;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k =  n *0.62;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k =  n *0.62;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k =  n *0.91;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k =  n *0.94;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *47.68;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n / 69.01;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n *75.34;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n *4.77;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n *0.62;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *6.56;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *5.41;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n *13.10;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n*2.54 ;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dirham");
            }

        } else if (s1.equals("France")) {
            if (s2.equals("America")) {
                Double k = n *1.13;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n *0.90;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n *1.62;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n / 1;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n *0.90;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n *1.47;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n *1.53;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *77.04;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n *1.11;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n*121.72;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n *7.74;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n *1;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *10.60;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *8.81;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n*21.54;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *4.14;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dirham");
            }

        } else if (s1.equals("NetherLand")) {
            if (s2.equals("America")) {
                Double k = n *1.13;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n *0.90;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n *1.62;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n / 1;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n *1;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n *1.47;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n *1.53;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *77.04;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n *1.11;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n*121.72;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n *7.74;
               // DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n *1;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *10.60;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *8.81;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n*21.54;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *4.14;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dirham");
            }
        } else if (s1.equals("Canada")) {
            if (s2.equals("America")) {
                Double k = n *0.77;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n *0.61;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n *1.10;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n *0.68;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n *0.68;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n *1.04;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *52.35;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n *0.76;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n*82.69;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n *5.26;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n *0.68;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *7.20;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *5.99;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n *14.64;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *2.81;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k  + "\n Dirham");
            }
        } else if (s1.equals("Singapur")) {
            if(s2.equals("America")) {
                Double k = n*0.74 ;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText( k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n *0.59;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n *1.06;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n *0.65;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n *0.65;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k =n *0.96;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *50.44;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n *0.73;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n *79.84;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n *5.06;
                //DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n *0.65;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *6.92;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *5.76;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n *14.10;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *2.71;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

        } else if (s1.equals("SwitzerLand")) {

            if (s2.equals("America")) {
                Double k = n *1.01;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n *0.81;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k =n *1.45;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n *0.90;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n *0.90;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n *1.32;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n *1.37;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *69.26;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n / 1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n *109.57;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k =n *6.95;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k =n *0.90;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *9.50;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *7.91;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n *19.35;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *3.72;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }
        } else if (s1.equals("Japan"))
        {
            if (s2.equals("America")) {
                Double k = n *0.0092;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k =  n *0.0074;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k =  n *0.013;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k =  n *0.0082;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k =  n *0.0082;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n *0.012;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k =  n *0.013;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k =  n *0.63;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n *0.0091;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k =  n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k =  n *0.063;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k =  n *0.0082;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k =  n *0.087;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k =  n *0.072;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k =  n *0.18;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *0.034;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }   }





        else if(s1.equals("China"))
        {

            if (s2.equals("America")) {
                Double k =  n *0.15;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k =  n *0.12;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k =  n *0.21;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k =  n *0.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n *0.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k =  n *0.19;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k =  n *0.20;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *9.95;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k =  n *0.14;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n *15.77;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k =  n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k =  n *0.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k =  n *1.37;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k =  n *1.14;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k =  n *2.78;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n *0.53;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

    }



        else if(s1.equals("Germany")){

            if (s2.equals("America")) {
                Double k =  n *1.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k =  n *0.90;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k =  n *1.61;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k =  n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k =  n *1.47;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k =  n *1.53;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *77.05;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k =  n *1.11;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k =  n *121.91;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Yen");
            } else if (s2.equals("China")) {
                Double k =  n *7.73;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *10.57;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k =  n *8.80;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k =  n *21.52;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k =  n *4.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

    }



        else if(s1.equals("Swedan"))
        {
            if (s2.equals("America")) {
                Double k =  n *0.11;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k =  n *0.085;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n *0.15;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n *0.095;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n *0.095;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n *0.14;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k =  n *0.14;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n *7.29;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k =  n *0.11;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k =  n *11.54;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k =  n *0.73;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k =  n *0.095;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n *1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n *0.83;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n *2.04;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k =  n *0.39;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

    }
        else if(s1.equals("HongKong")){

            if (s2.equals("America")) {
                Double k = n*0.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n*0.10;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n*0.18;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n*0.11;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n*0.11;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n*0.17;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n*0.17;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n*8.77;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n*0.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k =n*13.86;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k =n*0.88;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n*0.11;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n*1.20;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n / 1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n*2.44;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n*0.47;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

    }



        else if(s1.equals("Mexico")){

            if (s2.equals("America")) {
                Double k =n*0.052;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k =n*0.042;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n*0.075;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n*0.052;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n*0.046;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n*0.068;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n*0.071;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k =n*3.59;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n*0.052;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k = n*5.67;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n*0.36;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k =n*0.046;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k = n*0.49;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n*0.41;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k = n*1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k+ "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n*0.19;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

    }



        else if(s1.equals("UAE"))
        {
            if (s2.equals("America")) {
                Double k = n*0.27;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("UK")) {
                Double k = n*0.22;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Pound");
            } else if (s2.equals("Australia")) {
                Double k = n*0.39;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("France")) {
                Double k = n*0.24;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("NetherLand")) {
                Double k = n*0.24;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Canada")) {
                Double k = n*0.35;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Singapur")) {
                Double k = n*0.37;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("India")) {
                Double k = n*18.69;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Rupee");
            } else if (s2.equals("SwitzerLand")) {
                Double k = n*0.27;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Franc");
            } else if (s2.equals("Japan")) {
                Double k =n*29.50;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yen");
            } else if (s2.equals("China")) {
                Double k = n*1.87;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Yuan");
            } else if (s2.equals("Germany")) {
                Double k = n*0.24;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Euro");
            } else if (s2.equals("Swedan")) {
                Double k =n*2.55;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Korna");
            } else if (s2.equals("HongKong")) {
                Double k = n*2.13;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dollar");
            } else if (s2.equals("Mexico")) {
                Double k =n*5.20;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Peso");
            } else if (s2.equals("UAE")) {
                Double k = n*1;
                DecimalFormat df = new DecimalFormat("#.00");
                t3.setText(k + "\n Dirham");
            }

    }
    }

    }














