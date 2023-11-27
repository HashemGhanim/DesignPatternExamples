package factory.simplefactory.types;

import factory.simplefactory.interfaces.Button;

public class RoundedButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing a rounded button");
    }
}
