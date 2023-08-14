package com.example.letsseeindia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgNorth,imgSouth,imgEast;

        imgNorth = findViewById(R.id.imgNorth);
        imgSouth = findViewById(R.id.imgSouth);
        imgEast = findViewById(R.id.imgEast);

        //Setting Toolbar
        Toolbar toolbar;
        TextView toolbarTitle;

        toolbar = findViewById(R.id.toolbar);
        toolbarTitle = findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        toolbarTitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        
        imgNorth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Let's go to North India", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,NorthActivity.class);
                startActivity(intent);
            }
        });
    }
}