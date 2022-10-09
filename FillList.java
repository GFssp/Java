import java.util.*;

public class FillList {
    public static void main(String[] args) {
        
        // create an array and convert to a list
        Character[] letters = {'g', 'u', 'i'};
        List<Character> myList = Arrays.asList(letters);
        System.out.println("List is : ");
        output(myList);

        // reverse and print out the list
        Collections.reverse(myList);
        System.out.println("After reversed: ");
        output(myList);

        // create new array a new list
        Character[] newLetters = new Character[3];
        List<Character> listCopy = Arrays.asList(newLetters);

        // copy contents of list into listCopy
        Collections.copy(listCopy, myList);
        System.out.println("Copy a list: ");
        output(listCopy);

        // fill collection with myList
        Collections.fill(myList, 'X');
        System.out.println("After filling the list: ");
        output(myList);
    }

    //output method
    private static void output(List<Character> theList){

        for (Character item: theList){
            System.out.printf("%s ", item);
        }

        System.out.println();
    }
    
}
