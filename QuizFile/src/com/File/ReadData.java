import java.io.*;
import java.util.*;

import com.File.*;
public class ReadData {
    
  static ArrayList<String> questions = new ArrayList<String>();
  static ArrayList<String> answers   = new ArrayList<String>();
  static ArrayList<String> correctAns= new ArrayList<String>();
  int flagQuestion=0, flagAnswer=0,flagAns=0;     
  public  void read() {
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
          flagQuestion=1;
          //System.out.println("flagQuestion" + flagQuestion);
          continue;
        case "--QuestionEnd--":
          flagQuestion=0; 
          questions.add(strBuffer.toString() );
          strBuffer.setLength(0); 
          //System.out.println("flagQuestion" + flagQuestion);
          //System.out.println("Question" + questions);
          continue;
        case "--AnswerChoiceStart--":
          flagAnswer=1;
          continue;
        case "--AnswerChoiceEnd--":
          flagAnswer=0;  
          answers.add(strBuffer.toString() );
          strBuffer.setLength(0);
          //System.out.println("answer" + answers);
          continue;
        case "--correctAnswer":
          flagAns=1;
          continue;
        default :
          if (flagQuestion==1){           
            strBuffer.append(line);      //appends line to string buffer  
            strBuffer.append("\n");      //line feed   
          } 
          if (flagAnswer==1){           
            strBuffer.append(line);      //appends line to string buffer  
            strBuffer.append("\n");      //line feed   
          }  
          if(flagAns==1){
            correctAns.add(line.trim());
            flagAns=0;
          }
        } 
      } 
      fr.close();    //closes the stream and release the resources  
      System.out.println("Contents of File: ");  
      System.out.println(questions);   //returns a string that textually represents the object 
    }  
    catch(IOException e){  
      e.printStackTrace();  
    }  
  }
}
