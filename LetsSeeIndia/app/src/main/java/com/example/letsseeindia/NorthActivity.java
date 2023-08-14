package com.example.letsseeindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.letsseeindia.Adapters.NorthAdapter;
import com.example.letsseeindia.Models.NorthModel;

import java.util.ArrayList;

public class NorthActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);

        //Setting Toolbar
        Toolbar toolbar;
        TextView toolbarTitle;

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        toolbarTitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        recyclerView = findViewById(R.id.rvNorth);

        ArrayList<NorthModel> list = new ArrayList<>();

        list.add(new NorthModel(R.drawable.jaipur,"Jaipur",R.drawable.seend));
        list.add(new NorthModel(R.drawable.himachal,"Himachal Pradesh",R.drawable.seend));
        list.add(new NorthModel(R.drawable.kausani,"Kausani",R.drawable.seend));
        list.add(new NorthModel(R.drawable.ladakh,"Ladakh",R.drawable.seend));
        list.add(new NorthModel(R.drawable.mountabu,"Mount Abu",R.drawable.seend));
        list.add(new NorthModel(R.drawable.nainital,"Nainital",R.drawable.seend));
        list.add(new NorthModel(R.drawable.spiti,"Spiti Valley",R.drawable.seend));
        list.add(new NorthModel(R.drawable.udaipur,"Udaipur",R.drawable.seend));
        list.add(new NorthModel(R.drawable.pahalgam,"Pahalgam",R.drawable.seend));

        NorthAdapter northAdapter = new NorthAdapter(list,this);
        recyclerView.setAdapter(northAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}