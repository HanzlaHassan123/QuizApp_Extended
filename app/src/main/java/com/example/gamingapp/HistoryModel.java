package com.example.gamingapp;

public class HistoryModel {
    private String wrongAnswer;
    private  String rightAnswer;

    public HistoryModel(String wrongAnswer, String rightAnswer) {
        this.wrongAnswer = wrongAnswer;
        this.rightAnswer = rightAnswer;
    }

    public void setWrongAnswer(String wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getWrongAnswer() {
        return wrongAnswer;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }
}
