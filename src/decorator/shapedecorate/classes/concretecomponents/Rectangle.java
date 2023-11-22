package decorator.shapedecorate.classes.concretecomponents;
import decorator.shapedecorate.interfaces.maincomponent.Shape;

public class Rectangle implements Shape {
    private double height , width;

    public Rectangle() {
        this.height = 2.0;
        this.width = 4.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String draw() {
        return "Shape is : Rectangle";
    }

    @Override
    public String description() {
        return "Rectangle with height = " + this.height + " width = " + this.width + ", ";
    }
}
