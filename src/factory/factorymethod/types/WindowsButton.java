package factory.factorymethod.types;

import factory.factorymethod.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing a Windows button");
    }
}
