package com.kodilla.spring.intro.shape;

public class Drawer {
    Shape shape;

    public Drawer(Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}
