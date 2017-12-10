package com.kodilla.testing.shape;

public class Triangle implements Shape {
    @Override
    public void getShapeName() {
        System.out.println("Triangle");
    }

    @Override
    public int getField(int a, int b) {
        return 1/2 * a * b;
    }
}
