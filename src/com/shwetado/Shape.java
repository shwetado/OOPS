package com.shwetado;

public class Shape {
    private int width;
    private int height;

    public static Shape createRectangle(int width, int height) {
        return new Shape(width, height);
    }

    public static Shape createSquare(int side) {
        return new Shape(side, side);
    }

    private Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return (2 * (this.width + this.height));
    }

}
