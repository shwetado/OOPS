package com.shwetado.length;

public enum Unit {
    kilometer(1000000),meter(1000),centimeter(10),millimeter(1),
    inch(25.4), feet(304.8), yard(914.4), miles(1609344);

    private final double unit;

    Unit(double relation) {
        this.unit = relation;
    }

    public double getUnitValue() {
        return unit;
    }
}
