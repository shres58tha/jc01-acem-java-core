package com.Quiz;
import java.util.ArrayList;
public static class Board{
    int score;
    long timeStamp;
    String name;
}
public class Score {
    static int maxScore=0;         //need to be acessed from every object created
    static String maxScoreName;
    static String name;
    static long timeStamp;
    static long minTime=0;
    static int score;
    static ArrayList<Board> scoreBoard = new ArrayList<Board>();

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
    /*public void score(int correctAnswers, int totalQuestions){  // calculates score display score and sets the record
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
        setScoreBoard( score,  timeStamp,  name );
    }
    */
    public void score(int correctAnswers, int totalQuestions, long timeElapsed, String
     name){
        Board b = new Board();Board c;
        b.score=correctAnswers*100/totalQuestions;
        b.timeStamp=timeElapsed;
        b.name=name;

        for (int i=0;i<10;i++){
            c=scoreBoard.get(i);
            if (score > c.score){
                scoreBoard.add(b);
                break;
            }
            else if (score==c.score && time < c.time){
                scoreBoard.add(b);
                break;
            }
        }
        //code to truncate the

    }


    public void setScoreBoard(int score, long timeStamp, String name ){

            scoreBoard.add(score +"\t"+ timeStamp +"\t"+ player_name);
    }
    public void getScoreBoard() {
        java.util.Collections.sort(scoreBoard);
        System.out.println("\n\nSCORE BOARD\n*****************************\n\trank\tname\ttime\n");
        for (Board entry : scoreBoard) {
            System.out.println(entry.score +"\t"+entry.timeStamp +"\t"+entry.name);
        }
    }
    

}
