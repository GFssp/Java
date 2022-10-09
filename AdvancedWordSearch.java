import javax.swing.JOptionPane;

// Using equals


public class AdvancedWordSearch {
    public static void main(String[] args) {
        
        int wordCounter = 0;
        String sentence = JOptionPane.showInputDialog("Type a sentence: ");
        String wordList[] = sentence.split(" ");
        String searchWord = JOptionPane.showInputDialog("Search a word in the sentence typed: ");

        for (int i = 0; i < wordList.length; i++){
            if (searchWord.equals(wordList[i])){ // CONSULTA UTILIZADA
                wordCounter ++;
            }
        }

        JOptionPane.showMessageDialog(null, " The word " + searchWord + " appeared " + wordCounter + " time(s).");

    }
    
}
