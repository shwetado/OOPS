package com.shwetado.volume;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void testToGetVolumeInMillilitre() {
        Volume volume = new Volume(1d, LiquidUnit.milliliter);
        assertEquals(1d, volume.getValue());
        assertEquals(LiquidUnit.milliliter, volume.getUnit());
    }

    @Test
    public void testToGetVolumeInLitre() {
        Volume volume = new Volume(1d, LiquidUnit.liter);
        assertEquals(1d, volume.getValue());
        assertEquals(LiquidUnit.liter, volume.getUnit());
    }

    @Test
    public void testToConvertVolumeFromMilliliterToLitre() {
        Volume volume1 = new Volume(1000d, LiquidUnit.milliliter);
        Volume volume2 = new Volume(1d, LiquidUnit.liter);
        assertEquals(volume2, volume1.convertTo(LiquidUnit.liter));
    }

    @Test
    public void testToConvertVolumeFromMilliliterToGallons() {
        Volume volume1 = new Volume(3785.41d, LiquidUnit.milliliter);
        Volume volume2 = new Volume(1d, LiquidUnit.gallons);
        assertEquals(volume2, volume1.convertTo(LiquidUnit.gallons));
    }

    @Test
    public void testToConvertVolumeFromMilliliterToKiloliter() {
        Volume volume1 = new Volume(1000000d, LiquidUnit.milliliter);
        Volume volume2 = new Volume(1d, LiquidUnit.kiloliter);
        assertEquals(volume2, volume1.convertTo(LiquidUnit.kiloliter));
    }

}

