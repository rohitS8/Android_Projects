package com.example.tiktokclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.tiktokclone.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding; //activating binding
    ArrayList<Model> arrayList = new ArrayList<>(); //creating array list of model type
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        binding = ActivityMainBinding.inflate(getLayoutInflater()); //initializing binding
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        this.getTheme().applyStyle(R.style.FullScreen,false);

        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.vidi,R.drawable.pici,"Lara Ray"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.vidii,R.drawable.picii,"Sana Singh"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.vidiii,R.drawable.piciii,"Pushpa"));

        adapter = new Adapter(MainActivity.this,arrayList); //initializing adapter
        binding.viewPager.setAdapter(adapter);
    }
}