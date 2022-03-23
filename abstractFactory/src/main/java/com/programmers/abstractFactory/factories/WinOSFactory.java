package com.programmers.abstractFactory.factories;

import com.programmers.abstractFactory.buttons.Button;
import com.programmers.abstractFactory.buttons.WinButton;
import com.programmers.abstractFactory.checkouts.Checkout;
import com.programmers.abstractFactory.checkouts.WinCheckout;



public class WinOSFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WinButton();
    }

    @Override
    public Checkout createCheckout(){
        return new WinCheckout();
    }

}
