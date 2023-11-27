package factory.factorymethod.factories;

import factory.factorymethod.interfaces.Button;
import factory.factorymethod.interfaces.ButtonFactory;
import factory.factorymethod.types.WindowsButton;

public class WindowsButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
