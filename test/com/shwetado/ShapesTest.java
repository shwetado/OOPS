package com.shwetado;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ShapesTest {

    @Test
    public void testToGetTheAreaOfRectangle() {
        Shape rectangle = Shape.createRectangle(2, 3);
        assertEquals(6, rectangle.getArea());
    }

    @Test
    public void testToGetThePerimeterOfRectangle() {
        Shape rectangle = Shape.createRectangle(2, 3);
        assertEquals(10, rectangle.getPerimeter());
    }

    @Test
    public void testToGetTheAreaOfASquare() {
        Shape rectangle = Shape.createSquare(3);
        assertEquals(9, rectangle.getArea());
    }

    @Test
    public void testToGetThePerimeterOfASquare() {
        Shape rectangle = Shape.createSquare(10);
        assertEquals(40, rectangle.getPerimeter());
    }

    @Test
    public void testToGetPerimeterOfSquareWithLengthClass() {
        Shape square = Shape.createSquare(10);
        assertEquals(40, square.getPerimeter());
    }

}
