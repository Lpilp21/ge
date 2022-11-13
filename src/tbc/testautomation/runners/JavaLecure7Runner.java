package tbc.testautomation.runners;

import tbc.testautomation.abstractClassesInterfaces.figures.Circle;
import tbc.testautomation.abstractClassesInterfaces.realizationClasses.CircleRealization;

public class JavaLecure7Runner {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        circle.printPackageName();
        System.out.println("the area of old circle, with radius " + circle.getRadius() + " is: " + circle.getArea());
        System.out.println("the arc length of it is: " + circle.getLength());

        CircleRealization real1 = new CircleRealization();
        real1.returnDoubleSizedCircle(circle);
        System.out.println("new circle has positive radius: " + real1.validateCircle(circle) +". The radius is " + circle.getRadius());
        System.out.println("the are of new circle is: " + circle.getArea());
        System.out.println("the arc length of new circle is: " + circle.getLength());

        real1.returnCustomSizedCircle(circle, Math.E);
        System.out.println("new circle which has " + Math.E + " times the radius, as previous one " + " has area of " + circle.getArea() +
                ".  and arc length of: " + circle.getLength());
    }
}
