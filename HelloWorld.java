import java.util.concurrent.TimeUnit;

public class HelloWorld{
    public static void main(String[] args) throws Exception{
        System.out.println("Hello World!");
        
        long timeToSleep = 3L;
        TimeUnit time = TimeUnit.SECONDS;

        time.sleep(timeToSleep);
    }
}