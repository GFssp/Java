// Using CharAt
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ScramblePhrase {
    public static void main(String[] args) {
        
        String phrase = JOptionPane.showInputDialog(null, "Type something to see it reversed: ");
        ArrayList<Character> reversed = new ArrayList<>(); 

        for (int i = phrase.length() - 1; i > 0 ; i--){
            char letter = phrase.charAt(i);
            reversed.add(letter);
        }

        JOptionPane.showMessageDialog(null, "Scrambled message: " + reversed);
    }
}