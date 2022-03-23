package com.programmers.abstractFactory;

import com.programmers.abstractFactory.factories.MacOSFactory;
import com.programmers.abstractFactory.factories.WinOSFactory;

import java.awt.datatransfer.Clipboard;
import java.util.Locale;

public class Main {
    // os정보에 따라 팩토리 구상체 app에 넣어주기
    private static App client(){
        App app;

        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("mac")){
            app = new App(new MacOSFactory());
        }
        else{
            app = new App(new WinOSFactory());
        }

        return app;
    }


    public static void main(String[] args) {
        App app = client();
        app.paint();
    }
}
