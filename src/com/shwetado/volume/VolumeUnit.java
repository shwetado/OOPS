package com.shwetado.volume;

import com.shwetado.measurement.Unit;

public enum VolumeUnit implements Unit {
    MILLILITER(1), LITER(1000), KILOLITER(1000000), GALLON(3785.41);

    private double unitValue;

    VolumeUnit(double unitValue) {
        this.unitValue = unitValue;
    }

    @Override
    public Double getUnitValue() {
        return unitValue;
    }

    @Override
    public VolumeUnit getGreaterUnit(Unit otherUnit) {
        VolumeUnit volumeUnit = (VolumeUnit) otherUnit;
        return (this.getUnitValue() > volumeUnit.getUnitValue()
                ? this : volumeUnit);
    }

}
