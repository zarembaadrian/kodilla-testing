package com.kodilla.testing.shape;

public class Circle implements Shape {
    @Override
    public void getShapeName() {
        System.out.println("Circle");
    }

    @Override
    public int getField(int a, int b) {
        return (int)(2 * 3.14 * a);
    }
}
