package com.example.myapplication.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // Question 1
        List<String> options1 = new ArrayList<>();
        options1.add("Yamuna");
        options1.add("Ganges (Ganga)");
        options1.add("Brahmaputra");
        options1.add("Godavari");
        int correctAnswerIndex1 = 1; // Index of "Option B" as correct answer
        Question question1 = new Question("Which river is considered the holiest in Hinduism?", options1, correctAnswerIndex1);
        questions.add(question1);

        // Question 2
        List<String> options2 = new ArrayList<>();
        options2.add("Elephant");
        options2.add("Lion");
        options2.add("Tiger");
        options2.add("Peacock");
        int correctAnswerIndex2 = 2; // Index of "Option C" as correct answer
        Question question2 = new Question("What is the national animal of India?", options2, correctAnswerIndex2);
        questions.add(question2);

        // Question 3
        List<String> options3 = new ArrayList<>();
        options3.add("1945");
        options3.add(" 1947");
        options3.add("1950");
        options3.add("1962");
        int correctAnswerIndex3 = 1; // Index of "Option B" as correct answer
        Question question3 = new Question("In which year did India gain independence from British rule?", options3, correctAnswerIndex2);
        questions.add(question3);

        // Question 4
        List<String> options4 = new ArrayList<>();
        options4.add("Starry Night");
        options4.add(" The Persistence of Memory");
        options4.add("Mona Lisa");
        options4.add("The Scream");
        int correctAnswerIndex4 = 2; // Index of "Option C" as correct answer
        Question question4 = new Question("Which famous painting is known for its mysterious smile?", options4, correctAnswerIndex2);
        questions.add(question4);

        // Question 5
        List<String> options5 = new ArrayList<>();
        options5.add("Uttar Pradesh");
        options5.add("Madhya Pradesh");
        options5.add("Rajasthan");
        options5.add("TMaharashtra");
        int correctAnswerIndex5 = 2; // Index of "Option C" as correct answer
        Question question5 = new Question("What is the largest state in India by area?", options5, correctAnswerIndex2);
        questions.add(question5);

        // Add more questions here

        return questions;
    }
}
