package com.oscar.career.myapplication.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.oscar.career.myapplication.MainActivity2;
import com.oscar.career.myapplication.MainActivity3;
import com.oscar.career.myapplication.R;

import java.util.List;

public class MyRecAdapter extends RecyclerView.Adapter<MyRecAdapter.MyHolder> {

    List<String> myDaata;
    Context c;

    public MyRecAdapter(Context c,List<String> myDaata){
        this.c = c;
        this.myDaata = myDaata;
    }
//
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, @SuppressLint("RecyclerView") int position) {

        String temp = myDaata.get(position);

        holder.tv.setText(temp);
        holder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a1=new Intent(c, MainActivity3.class);
                a1.putExtra("key1",myDaata.get(position));
                c.startActivity(a1);

            }
        });


    }

    @Override
    public int getItemCount() {
        return myDaata.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView tv;
        ImageView iv;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            tv = itemView.findViewById(R.id.tv_1);

        }
    }


}
