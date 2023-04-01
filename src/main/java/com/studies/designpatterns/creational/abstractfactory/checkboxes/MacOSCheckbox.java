// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.abstractfactory.checkboxes;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
