// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.factorymethod.factory;

import com.studies.designpatterns.creational.factorymethod.buttons.Button;

public abstract class Dialog {

	public void renderWindow() {
		Button okButton = createButton();
		okButton.render();
	}

	public abstract Button createButton();
}
