package com.Quiz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int currentScore = 0;
        int maxScore = 0;
        Scanner myObj = new Scanner(System.in);
        Question myQuestion = new Question();
        Score score = new Score(); 
        
        while (true) {

            System.out.println("Lets learn Java Array by Quiz.\n Menu");
            System.out.println("1. Start to Learn");
            System.out.println("2. Max. Score");
            System.out.println("3. Exit");
            String userOption = myObj.nextLine();

            switch (userOption) {
                case "1":
                    myQuestion.questions();
                    System.out.println("Your Score is: " + score.getScore());
                    System.out.println("Max Score is : " + score.getMaxScore());
                    break;
                case "2":
                    System.out.println("Current Max. score  :" + score.getMaxScore());
                    break;
                case "3":
                    System.out.println("\nHOPE you got some Java Array Fluency.\n");
                    System.exit(0);
                    break;
            }
        }        
    }
}
