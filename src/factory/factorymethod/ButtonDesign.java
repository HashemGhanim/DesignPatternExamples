package factory.factorymethod;

import factory.factorymethod.factories.MacButtonFactory;
import factory.factorymethod.factories.WindowsButtonFactory;
import factory.factorymethod.interfaces.Button;
import factory.factorymethod.interfaces.ButtonFactory;

public class ButtonDesign {
    public static void main(String[] args) {
        ButtonFactory macButtonFactory = new MacButtonFactory();
        Button macButton = macButtonFactory.createButton();
        macButton.draw();
        // output : Drawing a Mac button


        ButtonFactory windowsButtonFactory = new WindowsButtonFactory();
        Button windowsButton = windowsButtonFactory.createButton();
        windowsButton.draw();
        // output : Drawing a Windows button
    }
}
