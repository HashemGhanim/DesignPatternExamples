package factory.abstractfactory.factories;

import factory.abstractfactory.interfaces.Button;
import factory.abstractfactory.interfaces.CheckBox;
import factory.abstractfactory.interfaces.GUIFactory;
import factory.abstractfactory.types.MacButton;
import factory.abstractfactory.types.MacCheckBox;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
