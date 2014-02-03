package com.shwetado.volume;

import com.shwetado.measurement.Measurement;
import com.shwetado.measurement.Unit;

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

    @Override
    public Volume convertTo(Unit unit) {
        VolumeUnit volumeUnit = (VolumeUnit) unit;
        Measurement measurement = super.convertTo(volumeUnit);
        return new Volume(measurement.getValue(), (VolumeUnit) measurement.getUnit());
    }

    @Override
    public Volume add(Measurement other) {
        Volume volume = (Volume) other;
        Measurement measurement = super.add(volume);
        return new Volume(measurement.getValue(),(VolumeUnit) measurement.getUnit());
    }

}
