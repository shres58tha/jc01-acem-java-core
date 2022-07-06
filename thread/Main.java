public class Main {  
   public static void main(String args[]){
        String resource1="Nepal";
        String resource2="ALU";
        Thread t1 = new Thread (() -> {
            synchronized (resource1){
                System.out.println(resource1);
                synchronized (resource2){
                        System.out.println(resource2);
                }
            }
        } );
        Thread t2 = new Thread (() -> {
            synchronized (resource2){
                System.out.println(resource2);
                synchronized (resource1){
                        System.out.println(resource1);
                }
            }
        } );
        t1.start();
        t2.start();
   }

   public synchronized void run(){
        
   }

}
