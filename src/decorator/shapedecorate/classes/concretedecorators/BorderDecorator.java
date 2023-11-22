package decorator.shapedecorate.classes.concretedecorators;

import decorator.shapedecorate.classes.decorators.ShapeDecoratore;
import decorator.shapedecorate.enums.BorderStyle;
import decorator.shapedecorate.enums.Color;
import decorator.shapedecorate.interfaces.maincomponent.Shape;

public class BorderDecorator extends ShapeDecoratore {
    private Color borderColor;
    private BorderStyle borderStyle;
    private double borderThickness;


    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
        this.borderColor = Color.WHITE;
        this.borderStyle = BorderStyle.DOTTED;
        this.borderThickness = 2.5;
    }

    public BorderDecorator(Shape decoratedShape, Color borderColor, BorderStyle borderStyle, double borderThickness) {
        super(decoratedShape);
        this.borderColor = borderColor;
        this.borderStyle = borderStyle;
        this.borderThickness = borderThickness;
    }

    @Override
    public String draw() {
        return super.draw();
    }

    @Override
    public String description() {
        return super.description() + " With Border Color " + this.borderColor + ", Border Style " + this.borderStyle + ", Border Thickness " + this.borderThickness;
    }

}
