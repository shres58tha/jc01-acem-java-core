package com.Quiz;

import java.util.Scanner;
import com.ScoreBoard.ScoreBoard;


public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        Game myGame = new Game();
        ScoreBoard sc= new ScoreBoard();
     
        while (true) {
            System.out.println("\n\nLets learn Java Array by Quiz.\n Menu");
            System.out.println("1. Start to Learn");
            System.out.println("2. View HallOfFame");
            System.out.println("3. Exit");
            String userOption = myScan.next();

            switch (userOption) {
                case "1":
                    myGame.game();
                    break;
                case "2":
                    sc.hallOfFameDisplay();
                    break;
                case "3":
                    System.out.println("\nHOPE you got some Java Array Fluency.\n");
                    myScan.close();      // stream close fix for warning of resource leak
                    System.exit(0);
                    break;
                default: 
                    System.out.println("\nInvalid choice! please choose 1, 2 or 3\n");
                    break;
            }
        }        
    }
}
