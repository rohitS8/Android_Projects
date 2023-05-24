package com.example.tabletrouble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button button;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.SButton);
        input = findViewById(R.id.SInput);
        output = findViewById(R.id.Soutput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Thank You! Keep learning", Toast.LENGTH_SHORT).show();

                String inp = input.getText().toString();
                int num = Integer.parseInt(inp);
                String result = "";

                for(int i =1;i<=10;i++){
                    result+=num+" "+"*"+i+" "+"="+" "+num*i+"\n";
                    output.setText(result);
                }
            }
        });

    }
}