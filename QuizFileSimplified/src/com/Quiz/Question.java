//optimized, less error checking chances
package com.Quiz;
import java.util.*;
import java.io.*;

public class Question
{
    int noOfQ=5;
    
    Scanner response = new Scanner(System.in) ;   // closed by java garbage collector when object of Question goes out of scope    

    public double questions () {
        ArrayList<String> questions = new ArrayList<String>();
        ArrayList<String> answers   = new ArrayList<String>();
        ArrayList<String> correctAns = new ArrayList<String>();
        int flag=0;    
        
          try {
            File file=new File("data");    //creates a new file instance  
            FileReader fr=new FileReader(file);   //reads the file          
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            StringBuffer strBuffer=new StringBuffer();    //constructs a string buffer with no characters  
            String line;  
            while((line=br.readLine())!=null){ 
              //System.out.println(line.trim());
              switch (line.trim()) {
                
              case "--QuestionStart--":
              case "--AnswerChoiceStart--":
              case "--correctAnswerStart--":
                flag=1;
                continue;
              case "--QuestionEnd--":
                flag=0; 
                //strBuffer.deleteCharAt(strBuffer.length()-1);  // delete last \n char
                questions.add(strBuffer.toString() );
                strBuffer.setLength(0); 
                continue;
              case "--AnswerChoiceEnd--":
                flag=0;  
                //strBuffer.deleteCharAt(strBuffer.length()-1);  // delete last \n char
                answers.add(strBuffer.toString() );
                strBuffer.setLength(0);
                continue;
              case "--correctAnswerEnd--":
                flag=0;
                correctAns.add(strBuffer.toString().trim());    // remove white space character at start or end
                strBuffer.setLength(0);
                continue;
              default :
                if (flag==1){           
                  strBuffer.append(line);      //appends line to string buffer  
                  strBuffer.append("\n");      //line feed   
                } 
              } 
            } 
            fr.close();    //closes the stream and release the resources  
          }  
          catch(IOException e){  
            e.printStackTrace();  
          }  
         int l=questions.size();
         String [] Q = new String [l+1];
         String [] A = new String [l+1];
         String [] C = new String [l+1];
      
        Q=questions.toArray(Q);
        A=answers.toArray(A);
        C=correctAns.toArray(C);
        /*
        for (int i = 0; i < l; i++) {                         //Display questions
            System.out.println(Q[i]);
            System.out.println(A[i]);  
            System.out.println(C[i]); 
            System.out.println("alu");
        }    
        */
        int[] array = new int[l+1];  

        for (int i = 0; i < l; i++) {                         //for randomizing questions
            array[i] = i;
        }     

        Random rand = new Random();
        
        for (int i = 0; i < l; i++) {                         //randomize questions
            int randInt = rand.nextInt(l);
            int temp = array[randInt];
            array[randInt] = array[i];
            array[i] = temp;
        }       
        
        int numCorrect = 0; 
        String reply;                                            // score tracker

        for (int i = 0; i < noOfQ; i++) {
            System.out.println("\n\n"+ (i+1) +" : " + Q[array[i]]) ;
            System.out.println(A[array[i]]) ;
            reply = response.next() ;
            while (!( reply.equals("1") || reply.equals("2") || reply.equals("3") || reply.equals("4"))){
                System.out.println("Invalid choice! please choose 1, 2, 3 or 4 ");
                reply = response.next() ;
            }
            if (reply.equals(C[array[i]])) {
                System.out.println(reply + " is correct") ;
                numCorrect++;
            } else
            System.out.println(reply + " is incorrect") ;
            System.out.println( C[array[i]] + " is correct answer");
        }
        //response.close();
        System.out.println( "\n numCorrect " + numCorrect/5);
        return (double)numCorrect/noOfQ;     // returned value is fraction of correctly answered question.
    }
}
