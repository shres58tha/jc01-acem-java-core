package com.Quiz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Question myQuestion = new Question();
        Score score = new Score(); 
 
        while (true) {
            System.out.println("\n\nLets learn Java Array by Quiz.\n Menu");
            System.out.println("1. Start to Learn");
            System.out.println("2. Max. Score");
            System.out.println("3. Exit");
            String userOption = input.nextLine();

            switch (userOption) {
                case "1":
                    myQuestion.questions();
                    System.out.println( "\n" + score.getName() +"\nThank you..\n   Your Score: " + score.getScore() + "\nTime duration: " + score.getTimeStamp());
                    break;
                case "2":
                    System.out.println("\nCurrent Max. score  :" + score.getMaxScore() + "\nCurrent Record Holder : " + score.getMaxScoreName()
                    + "\nCurrent min time : " + score.getMinTime());
                    break;
                case "3":
                    System.out.println("\nHOPE you got some Java Array Fluency.\n");
                    input.close();      // fix for warning of resource leak
                    System.exit(0);
                    break;
                default: 
                    System.out.println("\nInvalid choice! please choose 1, 2 or 3\n");
                    break;
            }
        }        
    }
}
