package com.shwetado.length;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {

    @Test(expected = IllegalArgumentException.class)
    public void testWhenGivenIllegalParameter(){
        new Length(-4, LengthUnit.METER);
    }

    @Test
    public void testLengthInMetersToCentimeter() {
        Length length1 = new Length(1, LengthUnit.METER);
        Length length2 = new Length(1000, LengthUnit.MILLIMETER);
        assertEquals(length2, length1.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInCentimetersToMeter() {
        Length length1 = new Length(400, LengthUnit.CENTIMETER);
        Length length2 = new Length(4, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInMillimeterToMeter() {
        Length length1 = new Length(4000, LengthUnit.MILLIMETER);
        Length length2 = new Length(4, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInKilometerToMeter() {
        Length length1 = new Length(4, LengthUnit.KILOMETER);
        Length length2 = new Length(4000, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

    @Test
    public void testLengthInInchToMillimeter() {
        Length length1 = new Length(1, LengthUnit.INCH);
        Length length2 = new Length(25.4, LengthUnit.MILLIMETER);
        assertEquals(length2, length1.convertTo(LengthUnit.MILLIMETER));
    }

    @Test
    public void testLengthInInchToFeet() {
        Length length1 = new Length(12, LengthUnit.INCH);
        Length length2 = new Length(1, LengthUnit.FEET);
        assertEquals(length2, length1.convertTo(LengthUnit.FEET));
    }

    @Test
    public void testLengthInInchToYards() {
        Length length1 = new Length(36, LengthUnit.INCH);
        Length length2 = new Length(1, LengthUnit.YARD);
        assertEquals(length2, length1.convertTo(LengthUnit.YARD));
    }

    @Test
    public void testLengthInInchToMiles() {
        Length length1 = new Length(63360, LengthUnit.INCH);
        Length length2 = new Length(1, LengthUnit.MILES);
        assertEquals(length2, length1.convertTo(LengthUnit.MILES));
    }
    @Test
    public void testLengthInMilesToInch() {
        Length length2 = new Length(1, LengthUnit.MILES);
        Length length1 = new Length(63360, LengthUnit.INCH);
        assertEquals(length1, length2.convertTo(LengthUnit.INCH));
    }
    @Test
    public void testLengthInMilesToMillimeter() {
        Length length1 = new Length(1609344, LengthUnit.MILLIMETER);
        Length length2 = new Length(1, LengthUnit.MILES);
        assertEquals(length1, length2.convertTo(LengthUnit.MILLIMETER));
    }
    @Test
    public void testLengthInInchToMeter() {
        Length length1 = new Length(1, LengthUnit.INCH);
        Length length2 = new Length(0.0254, LengthUnit.METER);
        assertEquals(length2, length1.convertTo(LengthUnit.METER));
    }

}
