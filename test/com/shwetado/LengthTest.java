package com.shwetado;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {

    @Test(expected = IllegalArgumentException.class)
    public void testWhenGivenIllegalParameter(){
        new Length(-4,Unit.meter);
    }

    @Test
    public void testLengthInMetersToCentimeter() {
        Length length1 = new Length(1,Unit.meter);
        Length length2 = new Length(1000,Unit.millimeter);
        assertEquals(length2, length1.convertTo(Unit.millimeter));
    }

    @Test
    public void testLengthInCentimetersToMeter() {
        Length length1 = new Length(400,Unit.centimeter);
        Length length2 = new Length(4,Unit.meter);
        assertEquals(length2, length1.convertTo(Unit.meter));
    }

    @Test
    public void testLengthInMillimeterToMeter() {
        Length length1 = new Length(4000,Unit.millimeter);
        Length length2 = new Length(4,Unit.meter);
        assertEquals(length2, length1.convertTo(Unit.meter));
    }

    @Test
    public void testLengthInKilometerToMeter() {
        Length length1 = new Length(4,Unit.kilometer);
        Length length2 = new Length(4000,Unit.meter);
        assertEquals(length2, length1.convertTo(Unit.meter));
    }

    @Test
    public void testLengthInInchToMillimeter() {
        Length length1 = new Length(1,Unit.inch);
        Length length2 = new Length(25.4,Unit.millimeter);
        assertEquals(length2, length1.convertTo(Unit.millimeter));
    }

    @Test
    public void testLengthInInchToFeet() {
        Length length1 = new Length(12,Unit.inch);
        Length length2 = new Length(1,Unit.feet);
        assertEquals(length2, length1.convertTo(Unit.feet));
    }

    @Test
    public void testLengthInInchToYards() {
        Length length1 = new Length(36,Unit.inch);
        Length length2 = new Length(1,Unit.yard);
        assertEquals(length2, length1.convertTo(Unit.yard));
    }

    @Test
    public void testLengthInInchToMiles() {
        Length length1 = new Length(63360,Unit.inch);
        Length length2 = new Length(1,Unit.miles);
        assertEquals(length2, length1.convertTo(Unit.miles));
    }
    @Test
    public void testLengthInMilesToInch() {
        Length length2 = new Length(1,Unit.miles);
        Length length1 = new Length(63360,Unit.inch);
        assertEquals(length1, length2.convertTo(Unit.inch));
    }
    @Test
    public void testLengthInMilesToMillimeter() {
        Length length1 = new Length(1609344,Unit.millimeter);
        Length length2 = new Length(1,Unit.miles);
        assertEquals(length1, length2.convertTo(Unit.millimeter));
    }
    @Test
    public void testLengthInInchToMeter() {
        Length length1 = new Length(1,Unit.inch);
        Length length2 = new Length(0.0254,Unit.meter);
        assertEquals(length2, length1.convertTo(Unit.meter));
    }

}
