package com.Quiz;
import com.File.ReadData;
import java.util.Random;
import java.util.Scanner;

public class Question
{
    int noOfQ=5;
    ReadData data= new ReadData();
    data.read();
    String[] questions  = data.questions;
    String[] answers    = data.answers;
    String[] correctAns = data.correctAns;
    Scanner response = new Scanner(System.in) ;   // closed by java garbage collector when object of Question goes out of scope    
    public double questions () {
        int[] array = { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19 };
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {                         //randomize questions
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }       
        int numCorrect = 0; 
        String answer;                                            // score tracker
        for (int i = 0; i < noOfQ; i++) {
            System.out.println("\n\n"+ (i+1) +" : " + questions[array[i]]) ;
            System.out.println(answers[array[i]]) ;
            answer = response.next() ;
            while (!( answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("4"))){
                System.out.println("Invalid choice! please choose 1, 2, 3 or 4 ");
                answer = response.next() ;
            }
            if (answer.equals(correctAns[array[i]])) {
                System.out.println(answer + " is correct") ;
                numCorrect++;
            } else
            System.out.println(answer + " is incorrect") ;
        }
        //response.close();
        System.out.println( "\n numCorrect " + numCorrect/5);
        return (double)numCorrect/noOfQ;     // returned value is fraction of correctly answered question.
    }
}
