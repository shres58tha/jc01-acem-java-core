public class Main {  
    public static void main(String args[]){
       System.out.println("Started main thread");  
         Play play1 = new Play(100);
         play1.start();
         System.out.println("ended main thread");  
    } 
 }
 