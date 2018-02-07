package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {

    @Test
    public void testDoDrawingWithCircle() {

       Circle circle = new Circle();

       Drawer drawer = new Drawer(circle);

       String result = drawer.doDrawing();

        Assert.assertEquals("This is a circle", result);

    }

    @Test
    public void testDoDrawingWithTriangle() {

        Triangle triangle = new Triangle();
        Drawer drawer = new Drawer(triangle);

        String result = drawer.doDrawing();

        Assert.assertEquals("This is a triangle", result);

    }
}
