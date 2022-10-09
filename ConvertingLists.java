import java.util.*;

// Converting lists to arrays
// The difference between a LinkedList and an ArrayList is that
// ArrayList has a default capacity of 10 elements.

// And linkedList use random access
// The time to get the first element is the same than the third 
// element.

public class ConvertingLists {
    public static void main(String[] args) {

        String[] myArray = {"ball", "watermelon", "fridge", "desk"};
        LinkedList<String> myList = new LinkedList<>(Arrays.asList(myArray));

        myList.add("pumpkin");
        myList.addFirst("brother");

        // Converting back
        myArray = myList.toArray(new String[myList.size()]);

        for (String x: myArray){
            System.out.printf("%s ", x);
        }
    }   
}
