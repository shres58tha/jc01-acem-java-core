package com.Quiz;

public class Score {
    static int maxScore=0;         //need to be acessed from every object created
    static String maxScoreName;
    static String name;
    static long timeStamp;
    static long minTime=0;
    static int score;

    public long getMinTime() {
        return minTime;
    }
    public long getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(long timeStamp) {
        Score.timeStamp = timeStamp;            // changed due to the warning static variable should be acessed static way
    }
    public String getMaxScoreName() {
        return maxScoreName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        Score.name = name;                      // changed due to the warning static variable should be acessed static way
    }
    public int getMaxScore() {
        return maxScore;
    }
    public int getScore() {
        return score;
    }
    public void score(int correctAnswers, int totalQuestions){  // calculates score display score and sets the record
        score = ( correctAnswers*100 / totalQuestions );
        System.out.println("\n\n Your score :" + score + "\nYour Time Stamp :" + timeStamp + "\n----------------------------------\n");
        if (maxScore<score){
            maxScore=score;
            maxScoreName=name;
            minTime = timeStamp;
        }
        if (maxScore == score && minTime > timeStamp){
            maxScoreName = name;
            minTime=timeStamp;
        }
    }
}
