package com.shwetado.volume;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void testToGetVolumeInMillilitre() {
        Volume volume = new Volume(1d, VolumeUnit.MILLILITER);
        assertEquals(1d, volume.getValue());
        assertEquals(VolumeUnit.MILLILITER, volume.getUnit());
    }

    @Test
    public void testToGetVolumeInLitre() {
        Volume volume = new Volume(1d, VolumeUnit.LITER);
        assertEquals(1d, volume.getValue());
        assertEquals(VolumeUnit.LITER, volume.getUnit());
    }

    @Test
    public void testToConvertVolumeFromMilliliterToLitre() {
        Volume volume1 = new Volume(1000d, VolumeUnit.MILLILITER);
        Volume volume2 = new Volume(1d, VolumeUnit.LITER);
        assertEquals(volume2, volume1.convertTo(VolumeUnit.LITER));
    }

    @Test
    public void testToConvertVolumeFromMilliliterToGallons() {
        Volume volume1 = new Volume(3785.41d, VolumeUnit.MILLILITER);
        Volume volume2 = new Volume(1d, VolumeUnit.GALLON);
        assertEquals(volume2, volume1.convertTo(VolumeUnit.GALLON));
    }

    @Test
    public void testToConvertVolumeFromMilliliterToKiloliter() {
        Volume volume1 = new Volume(1000000d, VolumeUnit.MILLILITER);
        Volume volume2 = new Volume(1d, VolumeUnit.KILOLITER);
        assertEquals(volume2, volume1.convertTo(VolumeUnit.KILOLITER));
    }

    @Test
    public void testToAddTwoQuantitiesOfVolume(){
        Volume volume1 = new Volume(1, VolumeUnit.KILOLITER);
        Volume volume2 = new Volume(1, VolumeUnit.KILOLITER);
        Volume actual = volume1.add(volume2);
        Volume expected = new Volume(2, VolumeUnit.KILOLITER);
        assertEquals(expected, actual);
    }

    @Test
    public void testToAddTwoDifferentQuantitiesOfVolume(){
        Volume volume1 = new Volume(1, VolumeUnit.KILOLITER);
        Volume volume2 = new Volume(1000, VolumeUnit.LITER);
        Volume actual = volume1.add(volume2);
        Volume expected = new Volume(2, VolumeUnit.KILOLITER);
        assertEquals(expected, actual);
    }
}

