public class GenericMethod {
    public static void main(String[] args) {

        Integer[] numbers = {8, 6, 2, 5, 2};

        printMe(numbers);
        
    }

    // generic method
    private static <T> void printMe(T[] x){
        for (T item: x){
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
    
}
