import javax.swing.JOptionPane;

public class SumPanel {
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Type another number: "));

        JOptionPane.showMessageDialog(null, "Sum result: " + (n1 + n2));




    }
    
}
