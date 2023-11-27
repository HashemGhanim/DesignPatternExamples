package factory.abstractfactory.types;

import factory.abstractfactory.interfaces.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Drawing a Mac CheckBox");
    }
}
