// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.abstractfactory.factories;

import com.studies.designpatterns.creational.abstractfactory.buttons.Button;
import com.studies.designpatterns.creational.abstractfactory.buttons.MacOSButton;
import com.studies.designpatterns.creational.abstractfactory.checkboxes.Checkbox;
import com.studies.designpatterns.creational.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
