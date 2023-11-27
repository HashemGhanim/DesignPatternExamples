package factory.abstractfactory.factories;

import factory.abstractfactory.interfaces.Button;
import factory.abstractfactory.interfaces.CheckBox;
import factory.abstractfactory.interfaces.GUIFactory;
import factory.abstractfactory.types.WindowsButton;
import factory.abstractfactory.types.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
