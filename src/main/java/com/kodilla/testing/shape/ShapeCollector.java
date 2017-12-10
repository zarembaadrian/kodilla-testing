package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public static void main(String[] args){}

        private ArrayList<Shape> figures = new ArrayList<>();

        Shape circle = new Circle();


    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        figures.get(n);
        return figures.get(n);
    }

    public int getFiguresListQuantity() {
        return figures.size();
    }

}
