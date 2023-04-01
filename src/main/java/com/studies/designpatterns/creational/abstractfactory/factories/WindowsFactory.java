// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.abstractfactory.factories;

import com.studies.designpatterns.creational.abstractfactory.buttons.Button;
import com.studies.designpatterns.creational.abstractfactory.buttons.WindowsButton;
import com.studies.designpatterns.creational.abstractfactory.checkboxes.Checkbox;
import com.studies.designpatterns.creational.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
