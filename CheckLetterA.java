// Using CharAt
import javax.swing.JOptionPane;

public class CheckLetterA {

    public static void main(String[] args) {
        
        String phrase = JOptionPane.showInputDialog("Type something: ");

        for (int i = 0; i < phrase.length(); i++){
            char letter = phrase.charAt(i);
            if (letter == 'a'){
                JOptionPane.showMessageDialog(null, "Letter A Found!");
            } 
        }
    }
    
}
