import javax.swing.JOptionPane;

public class ChatCliente{

    private static String novaMsg;

    public static String setNovaMsg(String msg){
        ChatCliente.novaMsg = msg;
        return ChatCliente.novaMsg;
    }

    public static void main(String[] args) {
        String msg = JOptionPane.showInputDialog("Digite oi: ");
        String novaMsg = setNovaMsg(msg);
        System.out.println(novaMsg);

    }
}