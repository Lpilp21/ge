package tbc.testautomation.abstractClassesInterfaces.interfaces;

import tbc.testautomation.abstractClassesInterfaces.figures.Circle;

public interface IValidCircle {
    //declares public abstract method which accepts Circle class object
    boolean validateCircle(Circle circle);
}
