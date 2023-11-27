package factory.factorymethod.factories;

import factory.factorymethod.interfaces.Button;
import factory.factorymethod.interfaces.ButtonFactory;
import factory.factorymethod.types.MacButton;

public class MacButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
