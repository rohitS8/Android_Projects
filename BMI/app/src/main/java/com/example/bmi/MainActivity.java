package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating variable
        EditText edtWeight, edtHeightFt, edtHeightIn;
        Button  btnCalculate;
        TextView txtResult;
        LinearLayout linearMain;

        //Linking with Id
        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        linearMain = findViewById(R.id.linearMain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override

            //What button will do
            public void onClick(View view) {

                int weight = Integer.parseInt(edtWeight.getText().toString());
                int hFeet = Integer.parseInt(edtHeightFt.getText().toString());
                int hIn = Integer.parseInt(edtHeightIn.getText().toString());

                //Calculation part
                int totalInches = hFeet*12+hIn;

                double totalCm = totalInches*2.53;

                double totalM = totalCm/100;

                double bmi = weight/(totalM*totalM);

                //Condition checking
                if (bmi>25){
                    txtResult.setText(R.string.overweight);
                    linearMain.setBackgroundColor(getResources().getColor(R.color.colorOver));
                } else if (bmi<18){
                    txtResult.setText(R.string.underweight);
                    linearMain.setBackgroundColor(getResources().getColor(R.color.colorUnder));
                } else {
                    txtResult.setText(R.string.healthy);
                    linearMain.setBackgroundColor(getResources().getColor(R.color.colorHealth));
                }
            }
        });
    }
}