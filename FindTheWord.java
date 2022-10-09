import javax.swing.JOptionPane;

public class FindTheWord {
    public static void main(String[] args) {
        
        String phrase = JOptionPane.showInputDialog("Type a phrase: ");
        String wordList[] = phrase.split(" ");

        int position =  Integer.parseInt(JOptionPane.showInputDialog("Type the numerical position of the prhase you typed: "));

        JOptionPane.showMessageDialog(null, wordList[position]);
    }
    
}
