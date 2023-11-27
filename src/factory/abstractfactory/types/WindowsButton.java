package factory.abstractfactory.types;

import factory.abstractfactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing a Windows button");
    }
}
