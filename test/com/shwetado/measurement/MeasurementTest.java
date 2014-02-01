package com.shwetado.measurement;

import com.shwetado.length.Length;
import com.shwetado.volume.Volume;
import com.shwetado.volume.VolumeUnit;
import com.shwetado.length.LengthUnit;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MeasurementTest {

    @Test
    public void testToCheckWhetherTwoObjectsAreEqual() {
        Measurement volume1 = new Measurement(10d, VolumeUnit.KILOLITER);
        Measurement volume2 = new Measurement(10d, VolumeUnit.KILOLITER);
        assertEquals(volume1, volume2);
    }

    @Test
    public void testToCheckWhetherTwoObjectsAreEqualForDifferentUnit() {
        Measurement volume1 = new Measurement(1d, VolumeUnit.KILOLITER);
        Measurement volume2 = new Measurement(1000d, VolumeUnit.LITER);
        assertEquals(volume1, volume2);
    }

    @Test
    public void testConvertsVolumeFromKiloliterToLiter() {
        Measurement volume1 = new Measurement(10d, VolumeUnit.KILOLITER);
        Measurement volume2 = new Measurement(10000d, VolumeUnit.LITER);
        assertEquals(volume2, volume1.convertTo(VolumeUnit.LITER));
    }

    @Test
    public void testToConvertVolumeFromMilliliterToGallons() {
        Measurement volume1 = new Measurement(3785.41d, VolumeUnit.MILLILITER);
        Measurement volume2 = new Measurement(1d, VolumeUnit.GALLON);
        assertEquals(volume2, volume1.convertTo(VolumeUnit.GALLON));
    }

    @Test
    public void testToConvertVolumeFromMilliliterToKiloliter() {
        Measurement volume1 = new Measurement(1000000d, VolumeUnit.MILLILITER);
        Measurement volume2 = new Measurement(1d, VolumeUnit.KILOLITER);
        assertEquals(volume2, volume1.convertTo(VolumeUnit.KILOLITER));
    }

    @Test
    public void testLengthInMetersToCentimeter() {
        Measurement length1 = new Measurement(1d, LengthUnit.METER);
        Measurement length2 = new Measurement(1000d, LengthUnit.MILLIMETER);
        assertEquals(length2, length1.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInCentimetersToMeter() {
        Measurement length1 = new Measurement(400d, LengthUnit.CENTIMETER);
        Measurement length2 = new Measurement(4d, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInMillimeterToMeter() {
        Measurement length1 = new Measurement(4000d, LengthUnit.MILLIMETER);
        Measurement length2 = new Measurement(4d, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInKilometerToMeter() {
        Measurement length1 = new Measurement(4d, LengthUnit.KILOMETER);
        Measurement length2 = new Measurement(4000d, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInInchToMillimeter() {
        Measurement length1 = new Measurement(1d, LengthUnit.INCH);
        Measurement length2 = new Measurement(25.4, LengthUnit.MILLIMETER);
        assertEquals(length2, length1.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInInchToFeet() {
        Measurement length1 = new Measurement(12d, LengthUnit.INCH);
        Measurement length2 = new Measurement(1d, LengthUnit.FEET);
        assertEquals(length2, length1.convertTo(LengthUnit.FEET));
    }

    @Test
    public void testLengthInInchToYards() {
        Measurement length1 = new Measurement(36d, LengthUnit.INCH);
        Measurement length2 = new Measurement(1d, LengthUnit.YARD);
        assertEquals(length2, length1.convertTo(LengthUnit.YARD));
    }

    @Test
    public void testLengthInInchToMiles() {
        Measurement length1 = new Measurement(63360d, LengthUnit.INCH);
        Measurement length2 = new Measurement(1d, LengthUnit.MILES);
        assertEquals(length2, length1.convertTo(LengthUnit.MILES));
    }

    @Test
    public void testLengthInMilesToInch() {
        Measurement length2 = new Measurement(1d, LengthUnit.MILES);
        Measurement length1 = new Measurement(63360d, LengthUnit.INCH);
        assertEquals(length1, length2.convertTo(LengthUnit.INCH));
    }

    @Test
    public void testLengthInMilesToMillimeter() {
        Measurement length1 = new Measurement(1609344d, LengthUnit.MILLIMETER);
        Measurement length2 = new Measurement(1d, LengthUnit.MILES);
        assertEquals(length1, length2.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInInchToMeter() {
        Measurement length1 = new Measurement(1d, LengthUnit.INCH);
        Measurement length2 = new Measurement(0.0254d, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthWillNotConvertToVolume() {
        Measurement length = new Measurement(1d, LengthUnit.INCH);
        Measurement volume = new Measurement(0.0254, VolumeUnit.LITER);
        assertEquals(volume, length.convertTo(VolumeUnit.LITER));
    }

    @Test(expected = ClassCastException.class)
    public void testToConvertVolumeFromMilliliterToLengthKilometer() {
        Volume volume = new Volume(1000000d, VolumeUnit.MILLILITER);
        volume.convertTo(LengthUnit.KILOMETER);
    }

    @Test(expected = ClassCastException.class)
    public void testToConvertLengthFromKilometerToVolumeMilliliter() {
        Length length = new Length(1000000d, LengthUnit.MILLIMETER);
        length.convertTo(VolumeUnit.MILLILITER);
    }

}
