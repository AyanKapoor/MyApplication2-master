package com.example.ayankapoor.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;
public class DisplayCheatActivity extends AppCompatActivity {

    TextView text_number2;
    TextView text_hint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_cheat);
        text_number2 = (TextView) findViewById((R.id.text_number2));
        text_hint = (TextView) findViewById((R.id.text_hint));
        Intent intent = getIntent();
        String message = intent.getStringExtra(HelloAndroid.EXTRA_MESSAGE);
        String number = intent.getStringExtra("number");
        int numberr =Integer.parseInt(number);
        if(isPrimeNumber(numberr)==1)
            text_hint.setText("is a prime number");
        else
            text_hint.setText("is not a prime number");
        text_number2.setText(number);

        //ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        //layout.addView(textView);
    }

    public static int isPrimeNumber(int num){
        if(num==2){
            return 1;
        }
        for(int i=2;i<=(int)Math.sqrt(num)+1;i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
    }
}
