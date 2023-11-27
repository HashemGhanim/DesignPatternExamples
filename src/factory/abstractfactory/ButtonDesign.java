package factory.abstractfactory;

import factory.abstractfactory.factories.MacGUIFactory;
import factory.abstractfactory.factories.WindowsGUIFactory;
import factory.abstractfactory.interfaces.Button;
import factory.abstractfactory.interfaces.CheckBox;
import factory.abstractfactory.interfaces.GUIFactory;

public class ButtonDesign {
    public static void main(String[] args) {
        GUIFactory macFactory = new MacGUIFactory();
        Button macButton = macFactory.createButton();
        CheckBox macCheckBox = macFactory.createCheckBox();

        macButton.draw();
        macCheckBox.draw();
        // output :
        //         Drawing a Mac button
        //         Drawing a Mac CheckBox


        GUIFactory windowsFactory = new WindowsGUIFactory();
        Button windowsButton = windowsFactory.createButton();
        CheckBox windowsCheckBox = windowsFactory.createCheckBox();

        windowsButton.draw();
        windowsCheckBox.draw();
        // output :
        //         Drawing a Windows button
        //         Drawing a Windows CheckBox
    }
}
