import java.lang.Math;
import javax.swing.JOptionPane;

public class MathPow {
    public static void main(String[] args) {

        // Math.sqrt = Raiz Quadrada
        // Math.pow = Potência
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Type its power: "));

        JOptionPane.showMessageDialog(null, "Powser result: " + Math.pow(n1, n2));   
    }
}
