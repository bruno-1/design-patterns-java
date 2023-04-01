// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.abstractfactory.app;

import com.studies.designpatterns.creational.abstractfactory.factories.GUIFactory;
import com.studies.designpatterns.creational.abstractfactory.factories.MacOSFactory;
import com.studies.designpatterns.creational.abstractfactory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        factory = osName.contains("mac") ? new MacOSFactory() : new WindowsFactory();
        app = new Application(factory);
        return app;
    }
    
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
