import javax.swing.JOptionPane;

// Using ToLowerCase

public class AreYouaMan {
    public static void main(String[] args) {

        String question1 = JOptionPane.showInputDialog("Are you a man?").toLowerCase();
        if (question1 == "yes"){
            String question1b = JOptionPane.showInputDialog("Do you have a penis? ").toLowerCase();
            
            if (question1b == "no"){
                JOptionPane.showMessageDialog(null, "Then you are not a man!");
            }

            else {
                JOptionPane.showMessageDialog(null, "Please don't lie to me");
            }
        }

        else if (question1 == "no"){
            String question1c = JOptionPane.showInputDialog("Do you have a vagina? ").toLowerCase();
            
            if (question1c == "yes"){
                JOptionPane.showMessageDialog(null, "Then you are not a man!");
            }

            else {
                JOptionPane.showMessageDialog(null, "Then you are a man!");
            }
        }
    }
}
