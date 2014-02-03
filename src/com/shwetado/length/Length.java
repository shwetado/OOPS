package com.shwetado.length;

import com.shwetado.measurement.Measurement;

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

    public Length convertTo(LengthUnit unit) {
        Measurement measurement = super.convertTo(unit);
        return new Length(measurement.getValue(), (LengthUnit) measurement.getUnit());
    }

    public Length add(Length other) {
        Measurement measurement = super.add(other);
        return new Length(measurement.getValue(),(LengthUnit) measurement.getUnit());
    }
}
