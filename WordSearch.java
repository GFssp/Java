import javax.swing.JOptionPane;

// Using Contains

public class WordSearch {
    public static void main(String[] args) {
        
        String sentence = JOptionPane.showInputDialog("Type a sentence: ");
        //String wordList[] = phrase.split(" ");
        String word = JOptionPane.showInputDialog("Search a word in the sentence typed: ");

        if (sentence.contains(word)){
            JOptionPane.showMessageDialog(null, "Word Found!");
        } else {
            JOptionPane.showMessageDialog(null, "Coudn't find word. sorry");
        }
    }
    
}
