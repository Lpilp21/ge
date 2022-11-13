package tbc.testautomation.abstractClassesInterfaces.figures;

import tbc.testautomation.abstractClassesInterfaces.abstractClasses.Figure;

public class Circle extends Figure {
    public static final double PI = 3.14;
    private double radius;
    //radius setter
    public void setRadius(double radius){
        this.radius = radius;

    }
    // radius getter
    public double getRadius() {
        return radius;
    }
    //constructor with one argument
    public Circle(double radius){
        this.radius = radius;
    }
    //implements Figure's abstract method: returns circle area
    public double getArea(){
        return radius * radius * PI;

    }
    //implements Figure's abstract method: returns circle arc length
    public double getLength(){
        return 2 * radius * PI;
    }
    //implements Figure's abstract method: returns the name of package in which the object is
    public void printPackageName(){

        System.out.println(this.getClass().getPackage());
    }
}
