// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.abstractfactory.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
