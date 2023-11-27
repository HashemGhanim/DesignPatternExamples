package factory.simplefactory.types;

import factory.simplefactory.interfaces.Button;

public class SquareButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing a square button");
    }
}
