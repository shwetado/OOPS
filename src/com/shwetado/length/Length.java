package com.shwetado.length;

import com.shwetado.measurement.Measurement;

public class Length extends Measurement {
    public Length(double value, LengthUnit unit) {
        super(value,unit);
    }

//    @Override
//    public boolean equals(Object o) {
//        if(super.equals(o))
//            if ((o instanceof Length)) return true;
//        return false;
//    }
}
