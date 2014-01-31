package com.shwetado.length;

public class Length {
    Unit unit;
    private double value;

    public Length(double length, Unit unit) {
        if (length < 0)
            throw new IllegalArgumentException();
        this.value = length;
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public Length convertTo(Unit otherUnit){
        double thisUnitValue = this.getUnit().getUnitValue();
        double otherUnitValue = otherUnit.getUnitValue();
        return new Length(thisUnitValue / otherUnitValue * this.value ,otherUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;

        Length length = (Length) o;

        Length otherUnit = length.convertTo(Unit.millimeter);
        Length thisUnit = this.convertTo(Unit.millimeter);

        return Double.compare(thisUnit.value, otherUnit.value) == 0;
    }

}
