package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

        private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public  Shape getFigure(int n) {
        return figures.get(n);
    }
    public Shape showFigures() {
        Shape myShape = null;
        for (int i = 0; i < figures.size(); i++) {
            myShape = figures.get(i);
        }
        return myShape;
    }

    public int getFiguresListQuantity() {
        return figures.size();
    }

}
