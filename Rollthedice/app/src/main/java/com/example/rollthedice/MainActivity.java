package com.example.rollthedice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView diceImage;
    Random range = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.DiceImage);

        diceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {

        int i = range.nextInt(5) + 1;
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.rotate);
        diceImage.startAnimation(anim);

        switch (i){
            case 1:
            diceImage.setImageResource(R.drawable.dice1);
                Toast.makeText(this, "You got "+i+" ~ Roll again!!", Toast.LENGTH_SHORT).show();
            break;
            case 2:
                diceImage.setImageResource(R.drawable.dice2);
                Toast.makeText(this, "You got "+i+" ~ Roll again!!", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                diceImage.setImageResource(R.drawable.dice3);
                Toast.makeText(this, "You got "+i+" ~ Roll again!!", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                diceImage.setImageResource(R.drawable.dice4);
                Toast.makeText(this, "You got "+i+" ~ Roll again!!", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                diceImage.setImageResource(R.drawable.dice5);
                Toast.makeText(this, "You got "+i+" ~ Roll again!!", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                diceImage.setImageResource(R.drawable.dice6);
                Toast.makeText(this, "You got "+i+" ~ Roll again!!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}