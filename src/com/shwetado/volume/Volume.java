package com.shwetado.volume;

import com.shwetado.measurement.Measurement;

public class Volume extends Measurement {
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    @Override
    public boolean equals(Object o) {
        if(super.equals(o))
            if ((o instanceof Volume)) return true;
        return false;
    }

    public Volume convertTo(VolumeUnit unit) {
        Measurement measurement = super.convertTo(unit);
        return new Volume(measurement.getValue(), (VolumeUnit) measurement.getUnit());
    }

    public Volume add(Volume other) {
        Measurement measurement = super.add(other);
        return new Volume(measurement.getValue(),(VolumeUnit) measurement.getUnit());
    }

}
