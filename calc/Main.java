public class Main {
    public static void main(String args[]){

        if (args.length!=3){
            System.out.println("invalid no of arguments");
            System.exit(1);
        }
        double x = Double.parseDouble(args[0]);
        String math = args[1];
        double y = Double.parseDouble(args[2]);

        MathCommand mathcommand = null;
        
        switch(math){
            case "+":
                mathcommand = new AddCommand();
                break;
            case "-":
                mathcommand = new SubCommand();
                break;
            case "*":
                mathcommand = new MulCommand();
                break;
            case "/":
                mathcommand = new DivCommand();
                break;
            
            case "%":
                mathcommand = new ModCommand();
                break;  
            
            case "^":
                mathcommand = new PowCommand();
                break;
            default:
                System.out.println(" math symbol + - * / expected");
                System.exit(1);
                
        }
        System.out.println(" result :" + mathcommand.calculate( x,y));
    }

}
/* 
public  class Main{
    public static void main(String args[]){
        //System.out.println("hello world");
     
        String input = args[0];
        Playable playable = null;
        
           
    }
    
    public static void play(Playable playable){
        playable.play();
        //playable.kick();
        if(playable instanceof Football){
            Football football = (Football) playable;
        football.kick();
        }
    
    }
}
*/