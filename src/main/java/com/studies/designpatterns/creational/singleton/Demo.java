// Code taken from the site: https://refactoring.guru
/*
    Use the Singleton pattern when a class in your program should have just a
    single instance available to all clients; for example, a single database
    object shared by different parts of the program.

    Use the Singleton pattern when you need stricter control over global variables.
*/
package com.studies.designpatterns.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
    
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }
    
    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
