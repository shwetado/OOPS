package com.shwetado.length;

import com.shwetado.measurement.Measurement;
import com.shwetado.measurement.Unit;

public class Length extends Measurement {
    public Length(double value, LengthUnit unit) {
        super(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o))
            if ((o instanceof Length)) return true;
        return false;
    }

    @Override
    public Length convertTo(Unit unit) {
        LengthUnit volumeUnit = (LengthUnit) unit;
        Measurement measurement = super.convertTo(volumeUnit);
        return new Length(measurement.getValue(), (LengthUnit) measurement.getUnit());
    }

    public Length add(Length other) {
        LengthUnit unit = getGreaterUnit((LengthUnit) other.getUnit());
        Length thisLength = this.convertTo(unit);
        Length otherLength = other.convertTo(unit);
        double additionValue = thisLength.getValue() + otherLength.getValue();
        return new Length(additionValue, unit);
    }

    private LengthUnit getGreaterUnit(LengthUnit otherUnit) {
        return (LengthUnit) (this.getUnit().getUnitValue() > otherUnit.getUnitValue()
                ? this.getUnit() : otherUnit);
    }
}
