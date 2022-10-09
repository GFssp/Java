public class ReverseBasic {
    public static void main(String[] args) {
        
        String word = "oi";
        String words[] = word.split(" ");

        for (int i = words.length; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
    
}
