package com.programmers.abstractFactory.factories;


import com.programmers.abstractFactory.buttons.Button;
import com.programmers.abstractFactory.checkouts.Checkout;

public interface GUIFactory {
    Button createButton();
    Checkout createCheckout();
}
