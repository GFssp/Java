import java.lang.Math;

public class Circle {

    private double radius;
    public String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius){
        radius = this.radius;
        color = "red";
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){

    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }
    
}
