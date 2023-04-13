// Code taken from the site: https://refactoring.guru
/*
    Use the Prototype pattern when your code shouldn’t depend on the concrete
    classes of objects that you need to copy.

    Use the pattern when you want to reduce the number of subclasses that only
    differ in the way they initialize their respective objects.
*/
package com.studies.designpatterns.creational.prototype;

import com.studies.designpatterns.creational.prototype.shapes.Circle;
import com.studies.designpatterns.creational.prototype.shapes.Rectangule;
import com.studies.designpatterns.creational.prototype.shapes.Shape;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);
        
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);
        
        Rectangule rectangule = new Rectangule();
        rectangule.width = 10;
        rectangule.height = 20;
        rectangule.color = "blue";
        shapes.add(rectangule);
        
        cloneAndCompare(shapes, shapesCopy);
    }
    
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
