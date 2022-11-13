package tbc.testautomation.abstractClassesInterfaces.interfaces;

import tbc.testautomation.abstractClassesInterfaces.figures.Circle;
import tbc.testautomation.abstractClassesInterfaces.realizationClasses.CircleRealization;

public interface IResizableCircle {
    //declares two public abstract methods
    Circle returnDoubleSizedCircle(Circle circle);
    Circle returnCustomSizedCircle(Circle circle, double byvValue);
}
