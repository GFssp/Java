import javax.swing.JOptionPane;

public class ReverseNumber {

    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        String convertedNumber = Integer.toString(number);
        String digitArray[] = convertedNumber.split(" ");

        for (int i = digitArray.length + 1; i >= 0; i--){
            System.out.print(convertedNumber.charAt(i));
        }
    }
}
