package com.Quiz;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import com.ScoreBoard.ScoreBoard;

public class Game {
   
    public void game(){
        Scanner response = new Scanner(System.in) ; 
        System.out.println("Your name please : ");
        String nm = response.next() ;

        Question myQ= new Question();
        ScoreBoard sB = new ScoreBoard();

        Instant startTime = Instant.now();
        double correct = myQ.questions();
        Instant endTime = Instant.now();
        
        Duration timeElapsed = Duration.between(startTime, endTime);
        long te=timeElapsed.toSeconds(); // sets current time duration in the Score
        int sc = (int) (100*correct);

        sB.setScoreBoard(sc, te, nm);

        //response.close();  // not commenting causes unknown error why not sure

    }
}
