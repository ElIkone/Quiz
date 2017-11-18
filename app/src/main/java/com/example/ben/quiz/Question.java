package com.example.ben.quiz;

public class Question {
    public Question(String mQuestion, int id) {
        this.mQuestion = mQuestion;
        this.id = id;
    }

    private String mQuestion;
    private int id;

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
