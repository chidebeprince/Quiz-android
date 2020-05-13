package com.example.quizzzzz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button;
    Button buttonn;
    TextView text;
    TextView text2;
    TextView text3;
    int index= 0;
    int trace = 1;
    int Tscore=0;


    TrueFalseModel[] me = {new TrueFalseModel(R.string.question1, true),
            new TrueFalseModel(R.string.question2, false),
            new TrueFalseModel(R.string.question3, true),
            new TrueFalseModel(R.string.question4, false),
            new TrueFalseModel(R.string.question5, false),
            new TrueFalseModel(R.string.question6, true),
            new TrueFalseModel(R.string.question7, false),
            new TrueFalseModel(R.string.question8, true),
            new TrueFalseModel(R.string.question9, false),
            new TrueFalseModel(R.string.question10, true),};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button1);
        buttonn = findViewById(R.id.button2);
        text = findViewById(R.id.question);
        text2 = findViewById(R.id.questionnum);
        text3 = findViewById(R.id.scores);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctAnswer(true);
                updateQuestion();
            }
        });
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctAnswer(false);
                updateQuestion();
            }
        });
    }

    public void updateQuestion() {
        if(index==9){
        AlertDialog.Builder send = new  AlertDialog.Builder(this);
        send.setTitle("Game Over");
        send.setCancelable(false);
        send.setMessage("You scored " + Tscore + "/10");
        send.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             finish();
            }
        });
        send.show();
        }
        else {
            trace = trace + 1;
            index = index + 1;
            TrueFalseModel hi = me[index];
            int hello = hi.getQuestion();
            text.setText(hello);
            Integer.toString(trace);
            text2.setText("Question " + trace + "/10");}



    }

    public void correctAnswer(boolean useranswer) {
        boolean us = me[index].isAnswer();
        if(us==useranswer) {
            Toast .makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
            Integer.toString(Tscore);
            Tscore = Tscore + 1;
            text3.setText(Tscore + "/10");

        }
        else{
         Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
        }
    }
}
