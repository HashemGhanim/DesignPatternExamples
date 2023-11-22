package decorator.shapedecorate.classes.decorators;

import decorator.shapedecorate.interfaces.maincomponent.Shape;

public abstract class ShapeDecoratore implements Shape {
    protected Shape decoratedShape;

    public ShapeDecoratore(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public String draw() {
        return decoratedShape.draw();
    }

    @Override
    public String description() {
        return decoratedShape.description();
    }
}
