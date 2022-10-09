import java.util.Arrays;
import java.util.List;

public class SortCollections {

    public static void main(String[] args) {
        
        String[] items = {"chair", "pen", "mouse", "computer"};
        List<String> list1 = Arrays.asList(items);

        CollectionsExample.sort(list1);
        System.out.println(list1);
    }
}
