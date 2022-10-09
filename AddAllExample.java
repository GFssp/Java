import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class AddAllExample {
    public static void main(String[] args) {
        
        // convert array to alist
        String[] items = {"apples", "beef", "corn", "ham"};
        List<String> myList = Arrays.asList(items);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("reddit");
        list2.add("twitter");

        for (String x: list2){
            System.out.printf("%s ", x);
        }

        Collections.addAll(list2, items);

        System.out.println();
        for (String x : list2){
            System.out.printf(x + " ");
        }
    }
    
}
