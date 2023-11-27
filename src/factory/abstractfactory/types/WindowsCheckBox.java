package factory.abstractfactory.types;

import factory.abstractfactory.interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Drawing a Windows CheckBox");
    }
}
