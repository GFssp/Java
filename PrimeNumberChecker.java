import javax.swing.JOptionPane;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        int primeNumbers[] = {2, 3, 5, 7, 11, 13, 17, 19};
        boolean isPrime = false;
        
        for (int i = 0; i < primeNumbers.length; i++){
            
            if (number % primeNumbers[i] != 0){
                isPrime = true;
            } else {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            JOptionPane.showMessageDialog(null, "Primo!");
        } else {
            JOptionPane.showMessageDialog(null, "Não é Primo.");
        }
    }
    
}
