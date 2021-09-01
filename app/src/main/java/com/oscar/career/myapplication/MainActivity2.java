package com.oscar.career.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.oscar.career.myapplication.adapter.MyRecAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        rv = findViewById(R.id.rec_view);
        rv.setLayoutManager(new LinearLayoutManager(this));

        List<String> myData = new ArrayList<>();
        myData.add("name 1");
        myData.add("name 2");
        myData.add("name 3");
        myData.add("name 4");
        myData.add("name 5");
        myData.add("name 6");
        myData.add("name 7");
        myData.add("name 8");
        myData.add("name 9");
        myData.add("name 10");
        myData.add("name 11");
        myData.add("name 12");
        myData.add("name 13");
        myData.add("name 14");
        myData.add("name 15");
        myData.add("name 16");
        myData.add("name 17");
        myData.add("name 18");
        myData.add("name 19");

        MyRecAdapter mv = new MyRecAdapter(this,myData);

        rv.setAdapter(mv);

//        List<String> myData = new ArrayList<>();
//        myData.add("name 1");
//        myData.add("name 2");
//        myData.add("name 3");
//        myData.add("name 4");
//        myData.add("name 5");
//        myData.add("name 6");
//        myData.add("name 7");
//        myData.add("name 8");
//        myData.add("name 9");
//        myData.add("name 10");
//        myData.add("name 11");
//        myData.add("name 12");
//        myData.add("name 13");
//        myData.add("name 14");
//        myData.add("name 15");
//        myData.add("name 16");
//        myData.add("name 17");
//        myData.add("name 18");
//        myData.add("name 19");

//        MyRecAdapter myAdapter = new MyRecAdapter(myData);

//        rv.setAdapter(myAdapter);

        LinearLayoutManager lm = new LinearLayoutManager(this);

//        GridLayoutManager gp = new GridLayoutManager(this,2);

        rv.setLayoutManager(lm);

    }
}