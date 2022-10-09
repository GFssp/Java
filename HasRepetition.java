import javax.swing.JOptionPane;

public class HasRepetition {
    public static void main(String[] args) {
        
        String sentence = JOptionPane.showInputDialog("Type a sentence: ");

        if (checkRepetition(sentence)){
            JOptionPane.showMessageDialog(null, "Has repetition.");
        } else {
            JOptionPane.showMessageDialog(null, "Doesn't has repetition.");
        }

    }

    private static boolean checkRepetition (String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) && input.indexOf(ch, i + 1) != -1) {
                return true;
            }
        }
        return false;
    }
    
}
