package com.Quiz;

import java.text.NumberFormat;

public class Score {

    public void score(int correctAnswers, int totalQuestions){
        NumberFormat scorePercentage = NumberFormat.getPercentInstance();
        double finalScore = ((double) correctAnswers / (double) totalQuestions);
        String finalScorePercent = scorePercentage.format(finalScore);
        System.out.println("Your Score is: " + finalScorePercent);

    }
}
