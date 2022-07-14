import java.util.Scanner;
import scoreboard.*;
public class Main {
    public static void main(String args[]){    
        ScoreBoard myScore=new ScoreBoard();
        Scanner input = new Scanner(System.in);
        String  c = new String("y");


        while(c.equals("y")){
        System.out.println("Your name please : ");
        String name = input.next();
        System.out.println("Your timestamp please : ");
        long timestamp = input.nextLong();
        System.out.println("Your score please : ");
        int score = input.nextInt();
        myScore.setScoreBoard(score, timestamp, name) ;

        myScore.getScoreBoardDisplay();

        System.out.println("continue ? enter y for y : any for no");
        c = input.next() ;

        }
    input.close();
    }
}
