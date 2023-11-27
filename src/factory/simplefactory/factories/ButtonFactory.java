package factory.simplefactory.factories;

import factory.simplefactory.interfaces.Button;
import factory.simplefactory.types.RoundedButton;
import factory.simplefactory.types.SquareButton;

public class ButtonFactory {
    public Button createButton(String type){
        if(type.equals("rounded"))
            return new RoundedButton();
        else if(type.equals("square"))
            return new SquareButton();
        else
            throw new IllegalArgumentException("Invalid button type");
    }
}
