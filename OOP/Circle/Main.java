public class Main{
    public static void main(String[] args) {
        
        Circle myCircle = new Circle();
        myCircle.setRadius(5);
        
        double result = myCircle.getArea();
        System.out.println(result);
    }
}