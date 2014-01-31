package com.shwetado.volume;

public class Volume {

    private double value;
    private LiquidUnit unit;

    public Volume(double value, LiquidUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LiquidUnit getUnit() {
        return unit;
    }

    public Volume convertTo(LiquidUnit unit) {
        Double thisValue = this.getUnit().getValue();
        Double otherValue = unit.getValue();
        return new Volume(thisValue/otherValue * this.getValue(), unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume)) return false;

        Volume volume = (Volume) o;

        Volume otherUnit = volume.convertTo(LiquidUnit.milliliter);
        Volume thisUnit = this.convertTo(LiquidUnit.milliliter);

        return Double.compare(thisUnit.value, otherUnit.value) == 0;
    }

}
