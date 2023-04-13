// Code taken from the site: https://refactoring.guru
package com.studies.designpatterns.creational.prototype.shapes;

public class Rectangule extends Shape {
    public int width;
    public int height;
    
    public Rectangule() { }
    
    public Rectangule(Rectangule target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }
    
    @Override
    public Shape clone() {
        return new Rectangule(this);
    }
    
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangule) || !super.equals(object2)) return false;
        Rectangule shape2 = (Rectangule) object2;
        return shape2.width == width && shape2.height == height;
    }
}
