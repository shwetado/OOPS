package com.shwetado.measurement;

public class Measurement {
    private Double value;
    private Unit unit;

    protected Measurement(Double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public Double getValue() {
        return value;
    }

    public Measurement convertTo(Unit otherUnit) {
        double thisUnitValue = this.getUnit().getUnitValue();
        double otherUnitValue = otherUnit.getUnitValue();
        return new Measurement(thisUnitValue / otherUnitValue * this.value, otherUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;

        Measurement measurement = (Measurement) o;

        Measurement otherUnit = measurement.convertTo(this.getUnit());
        Measurement thisUnit = this.convertTo(this.getUnit());

        return Double.compare(thisUnit.value, otherUnit.value) == 0;
    }
}
