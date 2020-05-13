package com.example.quizzzzz;

public class TrueFalseModel {
    private int Question;
    private boolean Answer;

    TrueFalseModel(int question,boolean answer){
     Question = question;
     Answer = answer;
    }

    public int getQuestion() {
        return Question;
    }

    public void setQuestion(int question) {
        Question = question;
    }

    public boolean isAnswer() {
        return Answer;
    }

    public void setAnswer(boolean answer) {
        Answer = answer;
    }
}
