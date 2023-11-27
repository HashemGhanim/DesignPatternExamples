package factory.factorymethod.types;

import factory.factorymethod.interfaces.Button;

public class MacButton implements Button {
    @Override
    public void draw(){
        System.out.println("Drawing a Mac button");
    }
}
