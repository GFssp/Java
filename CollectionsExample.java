import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


// There is two list of items
// The program will check if the second list has the same items of the first list
// If it has, th program will remove the repeated items and show the list.


public class CollectionsExample{
    public static void main(String[] args) {
        String objects[] = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        for (String obj: objects){
            list1.add(obj);
        }

        String otherObjects[] = {"hats", "eggs"};
        List<String> list2 = new ArrayList<String>();

        for (String obj: otherObjects){
            list2.add(obj);
        }

        for (int i = 0; i < list1.size(); i++){
            System.out.printf("%s", list1.get(i) + " ");
        }

        editList(list1, list2);

        for (int i = 0; i < list1.size(); i++){
            System.out.printf("\n" + "%s", list1.get(i) + " ");
        }
    }

    public static void editList (Collection<String> list1, Collection<String> list2){
        Iterator<String> it = list1.iterator();

        while(it.hasNext()){
            if (list2.contains(it.next())){
                it.remove();
            }
        }
    }

    public static void sort(List<String> list1) {
    }
}