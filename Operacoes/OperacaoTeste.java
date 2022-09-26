import javax.swing.JOptionPane;

public class OperacaoTeste {
    public static void main(String[] args) {
        Operacao  o = new Operacao();
        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("1 - Soma\n 2-Sub\n 3-Mult\n 4-Div"));
        }
        while (option < 1 || option > 5);
        if (option < 5){
            int x =  Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
            if (option == 1){
                JOptionPane.showMessageDialog(null, o.soma(x, y));
            }
            if (option == 2){
                JOptionPane.showMessageDialog(null, o.soma(x, y));
            }
            if (option == 3){
                JOptionPane.showMessageDialog(null, o.soma(x, y));
            }
            if (option == 4){
                JOptionPane.showMessageDialog(null, o.soma(x, y));
            }   

        }

        else {
            JOptionPane.showMessageDialog(null, "tchau", "saída", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
