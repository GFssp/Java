// Using Split
import javax.swing.JOptionPane;

public class ReverseWords {
    public static void main(String[] args) {

        String sentence = JOptionPane.showInputDialog("Type a sentence: ");

        String[] words = sentence.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {

            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(" ");
        }

        System.out.println(reversedString.toString());  
    }
}
