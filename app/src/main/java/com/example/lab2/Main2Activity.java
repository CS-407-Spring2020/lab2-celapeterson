package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    //create TextView instance to show the string from intent
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //create instance of TextView created in activity_main2.xml
        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent(); //get intent previously created

        //getStringExtra() gets string from previous activity
        String str = intent.getStringExtra("message");

        //use setText() to set text for TextView
        textView2.setText("Hello " + str);

    }
}
