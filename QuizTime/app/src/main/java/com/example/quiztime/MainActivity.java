package com.example.quiztime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button ans1,ans2,ans3,ans4;
    TextView showQuestion;
    Button submit;
    int score = 0;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    int totalquestions = questionAnswer.givenQuestion.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showQuestion = findViewById(R.id.question);
        submit = findViewById(R.id.submit);
        ans1 = findViewById(R.id.ans1);
        ans2 = findViewById(R.id.ans2);
        ans3 = findViewById(R.id.ans3);
        ans4 = findViewById(R.id.ans4);

        ans1.setOnClickListener(this);
        ans2.setOnClickListener(this);
        ans3.setOnClickListener(this);
        ans4.setOnClickListener(this);
        submit.setOnClickListener(this);

        loadQuestions();

    }

    private void loadQuestions() {

        if (currentQuestionIndex == totalquestions){

            finishQuiz();
            return;
        }

        showQuestion.setText(questionAnswer.givenQuestion[currentQuestionIndex]);
        ans1.setText(questionAnswer.choices[currentQuestionIndex][0]);
        ans2.setText(questionAnswer.choices[currentQuestionIndex][1]);
        ans3.setText(questionAnswer.choices[currentQuestionIndex][2]);
        ans4.setText(questionAnswer.choices[currentQuestionIndex][3]);
    }

    void finishQuiz() {

        String passStatus = "";
        if (score >= totalquestions*0.60){   //it is set to check if user scored more than 60%
            passStatus = "Your GK is good";
        }else{
            passStatus = "Polish your GK";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Your score is "+score+" out of 10")
                .setPositiveButton("Restart", (dialogInterface, i) -> restartQuiz())
                .setCancelable(false)
                .show();
    }

    void restartQuiz(){

        score = 0;
        currentQuestionIndex = 0;
        loadQuestions();
    }



    @Override
    public void onClick(View view) {

        ans1.setBackgroundColor(Color.BLUE);
        ans2.setBackgroundColor(Color.BLUE);
        ans3.setBackgroundColor(Color.BLUE);
        ans4.setBackgroundColor(Color.BLUE);


        Button clickedButton = (Button) view;

        if (clickedButton.getId()==R.id.submit){

            if (selectedAnswer.equals(questionAnswer.correctAnswer[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadQuestions();
        }else{
            //if user clicked the options
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }

    }
}