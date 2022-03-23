package com.programmers.abstractFactory.factories;


import com.programmers.abstractFactory.buttons.Button;
import com.programmers.abstractFactory.checkouts.Checkout;


// 각각의 구상체 팩토리는 버튼과 체크아웃을 생성
public interface GUIFactory {
    Button createButton();
    Checkout createCheckout();
}
