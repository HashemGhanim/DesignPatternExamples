package decorator;

import decorator.shapedecorate.classes.concretecomponents.Circle;
import decorator.shapedecorate.classes.concretedecorators.BorderDecorator;
import decorator.shapedecorate.classes.concretedecorators.FilledColorDecoratore;
import decorator.shapedecorate.enums.BorderStyle;
import decorator.shapedecorate.enums.Color;
import decorator.shapedecorate.interfaces.maincomponent.Shape;

public class Main {

    public static void main(String[] args){

        Shape circle = new BorderDecorator(
                new FilledColorDecoratore(
                        new Circle(
                                1.5
                        ) ,
                        Color.RED
                ),
                Color.BLACK ,
                BorderStyle.DASHED ,
                2.0
        );

        System.out.println(circle.draw());
        System.out.println(circle.description());
    }

}
