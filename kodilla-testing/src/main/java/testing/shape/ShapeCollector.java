package testing.shape;

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

    public void showFigures() {
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i));
        }
    }

    public int getFiguresListQuantity() {
        return figures.size();
    }

}
