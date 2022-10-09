// Using Split
import javax.swing.JOptionPane;

public class CountWords {
    public static void main(String[] args) {
        
        String phrase = JOptionPane.showInputDialog("Type something to count its words: ");
        String reversedWords[] = phrase.split(" "); // CONSULTA UTILIZADA

        for (int i = 0; i < reversedWords.length; i++){
            JOptionPane.showMessageDialog(null, i + "º : " + reversedWords[i]);
        }
    }
    
}
