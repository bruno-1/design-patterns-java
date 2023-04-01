// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.abstractfactory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
