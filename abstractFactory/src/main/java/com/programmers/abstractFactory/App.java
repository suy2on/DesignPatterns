package com.programmers.abstractFactory;

import com.programmers.abstractFactory.buttons.Button;
import com.programmers.abstractFactory.checkouts.Checkout;
import com.programmers.abstractFactory.factories.GUIFactory;

import javax.swing.plaf.basic.BasicButtonUI;

// 구상체 팩토리를 받으면 버튼과 체크아웃생성
public class App {
    GUIFactory factory;
    Button button;
    Checkout checkout;

    public App(GUIFactory factory){
        this.factory = factory;
        button = factory.createButton();
        checkout = factory.createCheckout();
    }
    public void paint(){
        button.paint();
        checkout.paint();
    }
}
