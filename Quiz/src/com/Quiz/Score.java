package com.Quiz;
import java.text.NumberFormat;

public class Score {
    int maxScore=0;
    int score;
    public int getMaxScore() {
        return maxScore;
    }
    public int getScore() {
        return score;
    }
    public void score(int correctAnswers, int totalQuestions){
        score = ((int)((double) correctAnswers*100 / (double) totalQuestions ));
        if (maxScore>score)
            maxScore=score;
    }
}
