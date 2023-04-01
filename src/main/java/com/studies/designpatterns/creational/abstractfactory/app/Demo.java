// Code taken from the site: https://refactoring.guru
/*
	Use the Abstract Factory when your code needs to work with various families
	of related products, but you don’t want it to depend on the concrete
	classes of those products—they might be unknown beforehand or you simply
	want to allow for future extensibility.

	Consider implementing the Abstract Factory when you have a class with a set
	of Factory Methods that blur its primary responsibility.
*/
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
