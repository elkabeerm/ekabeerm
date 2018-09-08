package com.example.kabeer_muhammad.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {




    int[] images={
            R.drawable.pizza,
            R.drawable.hotdog,
            R.drawable.burger,
            R.drawable.pasta,
            R.drawable.indianthali,
            R.drawable.macaroni,
            R.drawable.barbeque,
            R.drawable.sandwhc,
            R.drawable.vegrolls,
            R.drawable.noodles,};
    String[] name_price={"pizza:70",
            "hotdog:80",
            "burger:45",
            "pasta:80",
            "indianthali:60",
            "macaroni:67",
            "barbeque:75",
            "sandwhc:50",
            "vegrolls:30",
            "noodles:78"};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rec);
        recyclerView.setLayoutManager(new GridLayoutManager
                (this,2));
        recyclerView.setAdapter(new Rcadapter(images,name_price,this));
    }
}
