package com.example.memeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.memeapp.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int arr[] = {R.drawable.memei,
        R.drawable.memeii,
        R.drawable.memeiii,
        R.drawable.memeiv,
        R.drawable.memev,
        R.drawable.memevi};

        binding.imgView.setImageResource(arr[0]);

        binding.btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int temp = arr.length;
                Random random = new Random();
                int number = random.nextInt(temp);
                binding.imgView.setImageResource(arr[number]);
            }
        });
    }
}