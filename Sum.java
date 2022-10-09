import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sum{
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num1 = scan.nextInt();

        System.out.print("Type another number: ");
        int num2 = scan.nextInt();

        scan.close();

        TimeUnit time = TimeUnit.SECONDS;
        long timeToSleep = 4L;

        System.out.println("Sum result: " + (num1 + num2));
        time.sleep(timeToSleep);
    }
}