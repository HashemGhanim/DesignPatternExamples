package decorator.shapedecorate.classes.concretecomponents;

import decorator.shapedecorate.interfaces.maincomponent.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(){
        this.radius = 3.5;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Shape is : Circle";
    }

    @Override
    public String description() {
        return "Circle with radius = " + radius + ", ";
    }
}
