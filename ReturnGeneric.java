public class ReturnGeneric{
    public static void main(String[] args) {

        System.out.println(max(22, 42, 3));
        System.out.println(max("apples", "toys", "boys"));
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;

        // if b is greater than a
        if (b.compareTo(a) > 0){
            m = b;
        }

        if (c.compareTo(m) > 0){
            m = c;
        }

        return m;
    }
}