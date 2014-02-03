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
        LengthUnit lengthUnit = (LengthUnit) unit;
        Measurement measurement = super.convertTo(lengthUnit);
        return new Length(measurement.getValue(), (LengthUnit) measurement.getUnit());
    }

    @Override
    public Length add(Measurement other) {
        Length length = (Length) other;
        Measurement measurement = super.add(length);
        return new Length(measurement.getValue(),(LengthUnit) measurement.getUnit());
    }
}
