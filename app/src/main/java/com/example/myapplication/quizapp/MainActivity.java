package com.example.myapplication.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Question> questions; // Use List<Question> instead of CookieHandler
    private int currentQuestionIndex = 0; // Initialize current question index

    private TextView questionTextView;
    private RadioGroup optionsRadioGroup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionText);
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup);

        questions = QuestionBank.getQuestions();
        displayQuestion(questions.get(currentQuestionIndex));
    }

    private void displayQuestion(Question question) {
        questionTextView.setText(question.getQuestionText());

        optionsRadioGroup.removeAllViews();
        List<String> answerOptions = question.getAnswerOptions();
        for (int i = 0; i < answerOptions.size(); i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(answerOptions.get(i));
            optionsRadioGroup.addView(radioButton);
        }

        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(view -> onNextButtonClicked());
    }

    private void onNextButtonClicked() {
        int selectedAnswerIndex = optionsRadioGroup.indexOfChild(findViewById(optionsRadioGroup.getCheckedRadioButtonId()));
        Question currentQuestion = questions.get(currentQuestionIndex);

        if (selectedAnswerIndex == currentQuestion.getCorrectAnswerIndex()) {
            // Increment score if the answer is correct
            int score = 0;
            score++;
        }

        currentQuestionIndex++;

        if (currentQuestionIndex < questions.size()) {
            displayQuestion(questions.get(currentQuestionIndex));
        } else {
            displayResults();
        }
    }

    private void displayResults() {
        setContentView(R.layout.fragment_results);

        TextView scoreValueTextView = findViewById(R.id.scoreValue);
        char[] score = new char[0];
        scoreValueTextView.setText(String.valueOf(score));

        Button retryButton = findViewById(R.id.retryButton);
        retryButton.setOnClickListener(view -> restartQuiz());
    }

    private void restartQuiz() {
        setContentView(R.layout.activity_main);
        int score = 0;
        currentQuestionIndex = 0;
        displayQuestion(questions.get(currentQuestionIndex));
    }

    private int score = 0;

}
