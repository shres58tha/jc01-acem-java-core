public class Main {  
   public static void main(String args[]){
      System.out.println("Started main thread");  
   

        Play play1 = new Play();
        play1.setName("play1");
        Play play2 = new Play();
        play2.setName("play2");

        play1.setThread(play2);
        play2.setThread(play1);

        play1.start();
        play2.start();

        System.out.println("ended main thread");  
   }
   

}
