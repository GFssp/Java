import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        
        String[] things = {"apples", "noobs", "pwnge", "bacon", "gOats"};
        List<String> list1 = new LinkedList<String>();

        for (String x : things){
            list1.add(x);
        }

        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();

        for (String y : things2){
            list2.add(y);
        }

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 5);
        printMe(list1);
        reverseMe(list1);
    }

    //printMe Method
    private static void printMe(List<String> list){
        for (String item : list){
            System.out.printf("%s", item + " ");
        } 
        System.out.println(" ");
    }

    //removeStuff method
    private static void removeStuff(List<String> list, int from, int to){
        list.subList(from, to).clear();
    }

    //reverseMe
    private static void reverseMe(List<String> list){
        ListIterator<String> it = list.listIterator(list.size());

        while(it.hasPrevious()){
            System.out.printf("%s", it.previous() + " ");
        }
    }
    
}
