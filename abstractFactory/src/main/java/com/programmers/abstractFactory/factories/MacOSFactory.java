package com.programmers.abstractFactory.factories;

import com.programmers.abstractFactory.buttons.Button;
import com.programmers.abstractFactory.buttons.MacButton;
import com.programmers.abstractFactory.checkouts.Checkout;
import com.programmers.abstractFactory.checkouts.MacCheckout;


public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public Checkout createCheckout(){
        return new MacCheckout();
    }
}
