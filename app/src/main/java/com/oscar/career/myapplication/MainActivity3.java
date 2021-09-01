package com.oscar.career.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView mtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mtData = findViewById(R.id.data1);

        Intent i = getIntent();

        String s =i.getStringExtra("key1");

        mtData.setText(s);

    }
}