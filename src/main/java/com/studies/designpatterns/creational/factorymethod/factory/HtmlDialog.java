// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.factorymethod.factory;

import com.studies.designpatterns.creational.factorymethod.buttons.Button;
import com.studies.designpatterns.creational.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}
