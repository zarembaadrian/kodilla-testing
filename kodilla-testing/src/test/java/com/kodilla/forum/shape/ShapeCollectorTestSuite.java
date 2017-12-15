package com.kodilla.forum.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import testing.shape.*;


public class ShapeCollectorTestSuite {
@BeforeClass
    public static void beforeAllTests() {
    System.out.println("This is beginning of test.");
}
@AfterClass
    public static void afterAllTests() {
    System.out.println("All tests are done.");
}


@Test
    public void testAddFigure() {
    Shape circle = new Circle();
    ShapeCollector shapeCollector = new ShapeCollector();

    shapeCollector.addFigure(circle);
    Assert.assertEquals(1, shapeCollector.getFiguresListQuantity());
}
@Test
    public void testRemoveFigure() {
    Shape square = new Square();
    ShapeCollector shapeCollector = new ShapeCollector();

    shapeCollector.addFigure(square);
    shapeCollector.removeFigure(square);

    Assert.assertEquals(0,shapeCollector.getFiguresListQuantity());
}
@Test
    public void testGetFigure() {
    Shape triangle = new Triangle();
    Shape square = new Square();
    ShapeCollector shapeCollector = new ShapeCollector();

    shapeCollector.addFigure(triangle);
    shapeCollector.addFigure(square);

    Assert.assertEquals(square,shapeCollector.getFigure(1) );
}

}
