package tbc.testautomation.abstractClassesInterfaces.realizationClasses;

import tbc.testautomation.abstractClassesInterfaces.figures.Circle;
import tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;

public class CircleRealization implements IResizableCircle {

    //returns circle with two times the radius as previous one
    public Circle returnDoubleSizedCircle(Circle circle) {
        circle.setRadius(2 * circle.getRadius());
        return circle;


    }
    //returns circle with byvValue times the radius as previous one
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        circle.setRadius(byvValue * circle.getRadius());
        return circle;
    }
    //validates radius: returns true if radius is positive
    // returns false if the radius is negative or zero
    public boolean validateCircle(Circle circle){
        if(circle.getRadius() > 0)
            return true;
        else return false;
    }

}
