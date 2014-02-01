package com.shwetado.measurement;

import com.shwetado.length.Length;
import com.shwetado.volume.Volume;
import com.shwetado.volume.VolumeUnit;
import com.shwetado.length.LengthUnit;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MeasurementTest {

    @Test
    public void testConvertsVolumeFromKiloliterToLiter() {
        Measurement volume1 = new Measurement(10, VolumeUnit.KILOLITER);
        Measurement volume2 = new Measurement(10000, VolumeUnit.LITER);
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
        Measurement length1 = new Measurement(1, LengthUnit.METER);
        Measurement length2 = new Measurement(1000, LengthUnit.MILLIMETER);
        assertEquals(length2, length1.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInCentimetersToMeter() {
        Measurement length1 = new Measurement(400, LengthUnit.CENTIMETER);
        Measurement length2 = new Measurement(4, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInMillimeterToMeter() {
        Measurement length1 = new Measurement(4000, LengthUnit.MILLIMETER);
        Measurement length2 = new Measurement(4, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInKilometerToMeter() {
        Measurement length1 = new Measurement(4, LengthUnit.KILOMETER);
        Measurement length2 = new Measurement(4000, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInInchToMillimeter() {
        Measurement length1 = new Measurement(1, LengthUnit.INCH);
        Measurement length2 = new Measurement(25.4, LengthUnit.MILLIMETER);
        assertEquals(length2, length1.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInInchToFeet() {
        Measurement length1 = new Measurement(12, LengthUnit.INCH);
        Measurement length2 = new Measurement(1, LengthUnit.FEET);
        assertEquals(length2, length1.convertTo(LengthUnit.FEET));
    }

    @Test
    public void testLengthInInchToYards() {
        Measurement length1 = new Measurement(36, LengthUnit.INCH);
        Measurement length2 = new Measurement(1, LengthUnit.YARD);
        assertEquals(length2, length1.convertTo(LengthUnit.YARD));
    }

    @Test
    public void testLengthInInchToMiles() {
        Measurement length1 = new Measurement(63360, LengthUnit.INCH);
        Measurement length2 = new Measurement(1, LengthUnit.MILES);
        assertEquals(length2, length1.convertTo(LengthUnit.MILES));
    }

    @Test
    public void testLengthInMilesToInch() {
        Measurement length2 = new Measurement(1, LengthUnit.MILES);
        Measurement length1 = new Measurement(63360, LengthUnit.INCH);
        assertEquals(length1, length2.convertTo(LengthUnit.INCH));
    }

    @Test
    public void testLengthInMilesToMillimeter() {
        Measurement length1 = new Measurement(1609344, LengthUnit.MILLIMETER);
        Measurement length2 = new Measurement(1, LengthUnit.MILES);
        assertEquals(length1, length2.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInInchToMeter() {
        Measurement length1 = new Measurement(1, LengthUnit.INCH);
        Measurement length2 = new Measurement(0.0254, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthWillNotConvertToVolume() {
        Measurement length = new Measurement(1, LengthUnit.INCH);
        Measurement volume = new Measurement(0.0254, VolumeUnit.LITER);
        assertEquals(volume, length.convertTo(VolumeUnit.LITER));
    }

    @Test
    public void testToGetAInstanceOfVolume() {
        Volume volume = Measurement.getVolume(1d, VolumeUnit.KILOLITER);
        Volume expected = new Volume(1000d, VolumeUnit.LITER);
        assertEquals(expected, volume.convertTo(VolumeUnit.LITER));
    }

    @Test
    public void testToGetAInstanceOfLength() {
        Length length = Measurement.getLength(10d, LengthUnit.CENTIMETER);
        Length expected = new Length(100, LengthUnit.MILLIMETER);
        assertEquals(expected, length.convertTo(LengthUnit.MILLIMETER));
    }


    @Test(expected = ClassCastException.class)
    public void testToConvertVolumeFromMilliliterToKilometer() {
        Volume volume = Measurement.getVolume(1000000d, VolumeUnit.MILLILITER);
        volume.convertTo(LengthUnit.KILOMETER);
    }

    @Test(expected = ClassCastException.class)
    public void testToConvertVolumeFromMilliliterToLengthKilometer() {
        Volume volume = new Volume(1000000d, VolumeUnit.MILLILITER);
        volume.convertTo(LengthUnit.KILOMETER);
    }

}
