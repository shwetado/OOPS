package com.shwetado.length;

import com.shwetado.measurement.Unit;

public enum LengthUnit implements Unit{
    KILOMETER(1000000), METER(1000), CENTIMETER(10), MILLIMETER(1),
    INCH(25.4), FEET(304.8), YARD(914.4), MILES(1609344);

    private final double unit;

    LengthUnit(double relation) {
        this.unit = relation;
    }

    public Double getUnitValue() {
        return unit;
    }
}
