import javax.swing.JOptionPane;

public class AnagramTest {
    public static void main(String[] args) throws Exception {

        int mainCounter = 0;
        int counterA = 0;
        int counterB = 0;

        String firstWord = JOptionPane.showInputDialog("First word: ");
        String secondWord = JOptionPane.showInputDialog("Second word: ");

        if (firstWord.length() == secondWord.length()){

            while (mainCounter < (firstWord.length() * 2)){

                if (firstWord.charAt(counterA) != secondWord.charAt(counterB)){
                    counterB ++;

                    if (counterB == firstWord.length()){
                        JOptionPane.showMessageDialog(null, "Nope.");
                        System.exit(0);
                    }
                }

                else {
                    counterA ++;
                    counterB = 0;
                }
            
            mainCounter ++;
            }

            JOptionPane.showMessageDialog(null, "Yes! They are anagrams!");

        }

        else {
            JOptionPane.showMessageDialog(null, "Anagrams must have the same size.");
        }
    }
}