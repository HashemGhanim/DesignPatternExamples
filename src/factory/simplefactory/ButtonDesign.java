package factory.simplefactory;

import factory.simplefactory.factories.ButtonFactory;
import factory.simplefactory.interfaces.Button;

public class ButtonDesign {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = new ButtonFactory();

        Button roundedButton = buttonFactory.createButton("rounded");
        roundedButton.draw();
        // output : Drawing a rounded button

        Button squareButton = buttonFactory.createButton("square");
        squareButton.draw();
        // output : Drawing a square button
    }
}
