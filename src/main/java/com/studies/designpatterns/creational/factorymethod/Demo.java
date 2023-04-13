// Code taken from the site: https://refactoring.guru
/*
    Use the Factory Method when you don’t know beforehand the exact types and
    dependencies of the objects your code should work with.

    Use the Factory Method when you want to provide users of your library or
    framework with a way to extend its internal components.

    Use the Factory Method when you want to save system resources by reusing
    existing objects instead of rebuilding them each time.
 */
package com.studies.designpatterns.creational.factorymethod;

import com.studies.designpatterns.creational.factorymethod.factory.Dialog;
import com.studies.designpatterns.creational.factorymethod.factory.HtmlDialog;
import com.studies.designpatterns.creational.factorymethod.factory.WindowsDialog;

public class Demo {
	private static Dialog dialog;

	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

	static void configure() {
		dialog = System.getProperty("os.name").equals("Windows 10") ? new WindowsDialog() : new HtmlDialog();
	}

	static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
