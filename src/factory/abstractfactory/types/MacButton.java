package factory.abstractfactory.types;

import factory.abstractfactory.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing a Mac button");
    }
}
