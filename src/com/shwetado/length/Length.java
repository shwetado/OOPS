package com.shwetado.length;

import com.shwetado.measurement.Measurement;
import com.shwetado.measurement.Unit;

public class Length extends Measurement {
    public Length(double value, LengthUnit unit) {
        super(value,unit);
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o))
            if ((o instanceof Length)) return true;
        return false;
    }

    @Override
    public Length convertTo(Unit unit) {
        LengthUnit volumeUnit = (LengthUnit) unit;
        Measurement measurement = super.convertTo(volumeUnit);
        return new Length(measurement.getValue(), (LengthUnit) measurement.getUnit());
    }
}
