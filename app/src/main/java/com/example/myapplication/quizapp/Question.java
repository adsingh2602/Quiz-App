package com.example.myapplication.quizapp;

import java.util.List;

public class Question {
    private String questionText;
    private List<String> answerOptions;
    private int correctAnswerIndex;

    public Question(String questionText, List<String> answerOptions, int correctAnswerIndex) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getAnswerOptions() {
        return answerOptions;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
