// Code taken from the site: https://refactoring.guru
/*
    Use the Abstract Factory when your code needs to work with various families
    of related products, but you don’t want it to depend on the concrete classes
    of those products—they might be unknown beforehand or you simply want to
    allow for future extensibility.

    In a well-designed program each class is responsible only for one thing.
    When a class deals with multiple product types, it may be worth extracting
    its factory methods into a stand-alone factory class or a full-blown
    Abstract Factory implementation.
*/
package com.studies.designpatterns.creational.abstractfactory.app;

import com.studies.designpatterns.creational.abstractfactory.buttons.Button;
import com.studies.designpatterns.creational.abstractfactory.checkboxes.Checkbox;
import com.studies.designpatterns.creational.abstractfactory.factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;
    
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
