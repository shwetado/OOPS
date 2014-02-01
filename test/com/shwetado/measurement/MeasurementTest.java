package com.shwetado.measurement;

import com.shwetado.volume.VolumeUnit;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MeasurementTest {
    @Test
    public void testConvertsVolumeFromKiloliterToLiter() {
        Measurement volume1 = new Measurement(10, VolumeUnit.KILOLITER);
        Measurement volume2= new Measurement(10000, VolumeUnit.LITER);
        assertEquals(volume2,volume1.convertTo(VolumeUnit.LITER) );
    }


}
