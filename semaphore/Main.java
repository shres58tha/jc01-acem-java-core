import java.util.stream.IntStream;

public class Main {
    public static void public static void main(String[] args) {
        Testvalue  testvalue = new TestValue(1);

        Thread t1 = new Thread( ()-> IntStream.range(startInclusive:1, endExclusive:100).forEach (i -> testvalue.increment() ) ) ;
            
    t1.start();
    //t2.start();
    try {
        Thread.sleep(millis, 2000);
     }catch (Exception ex){

     }
     System.out.println(x);
}
  
