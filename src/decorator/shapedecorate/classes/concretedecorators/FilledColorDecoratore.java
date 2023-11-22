package decorator.shapedecorate.classes.concretedecorators;

import decorator.shapedecorate.classes.decorators.ShapeDecoratore;
import decorator.shapedecorate.enums.Color;
import decorator.shapedecorate.interfaces.maincomponent.Shape;

public class FilledColorDecoratore extends ShapeDecoratore {

    private Color filledColorType;

    public FilledColorDecoratore(Shape decoratedShape) {
        super(decoratedShape);
        this.filledColorType = Color.BLACK;
    }

    public FilledColorDecoratore(Shape decoratedShape, Color filledColorType) {
        super(decoratedShape);
        this.filledColorType = filledColorType;
    }

    @Override
    public String draw() {
        return super.draw();
    }

    @Override
    public String description() {
        return super.description() + " With Color " + this.filledColorType + ", ";
    }
}
