package com.shwetado.measurement;

public class Measurement {
    private double value;
    private Unit unit;

    public Measurement(double value, Unit unit){
        this.value = value;
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public Measurement convertTo(Unit otherUnit){
        double thisUnitValue = this.getUnit().getUnitValue();
        double otherUnitValue = otherUnit.getUnitValue();
        return new Measurement(thisUnitValue / otherUnitValue * this.value ,otherUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;

        Measurement measurement = (Measurement) o;

        Measurement otherUnit = measurement.convertTo(this.getDefaultUnit());
        Measurement thisUnit = this.convertTo(this.getDefaultUnit());

        return Double.compare(thisUnit.value, otherUnit.value) == 0;
    }

    private Unit getDefaultUnit() {
        return this.getUnit();
    }

}
