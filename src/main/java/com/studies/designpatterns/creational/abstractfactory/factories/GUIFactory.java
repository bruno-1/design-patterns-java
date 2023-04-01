// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.abstractfactory.factories;

import com.studies.designpatterns.creational.abstractfactory.buttons.Button;
import com.studies.designpatterns.creational.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
