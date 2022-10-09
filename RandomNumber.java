import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomNumber {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();

        int x = random.nextInt(10);
        long timeToSleep = 10L;
        TimeUnit time = TimeUnit.SECONDS;

        System.out.println(x);
        time.sleep(timeToSleep);
    }
    
}
