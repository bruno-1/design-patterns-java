// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.factorymethod.factory;

import com.studies.designpatterns.creational.factorymethod.buttons.Button;
import com.studies.designpatterns.creational.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
