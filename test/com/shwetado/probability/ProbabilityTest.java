package com.shwetado.probability;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {

    @Test
    public void testToRepresentProbability() {
        Probability actual = new Probability(0.5);
        assertEquals(0.5, actual.getValue());
    }

    @Test
    public void testToGetInverseProbability() {
        Probability probability = new Probability(0.8);
        assertEquals(0.2, probability.not(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWhenProbabilityIsGivenMoreThan1() {
        Probability probability = new Probability(5);
        assertEquals(0.2, probability.not(), 1);
    }

    @Test
    public void testProbabilityOf2Objects() {
        Probability p1 = new Probability(1 / 6);
        Probability p2 = new Probability(1 / 6);
        Probability probability = p1.and(p2);
        assertEquals(p1.getValue(), probability.getValue());
    }

    @Test
    public void testOrProbability() {
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);
        Probability actual = p1.or(p2);
        Probability expected = new Probability(0.75);
        assertEquals(expected, actual);
    }

    @Test
    public void testXORProbability() {
        Probability p1 = new Probability(0.5);
        Probability p2 = new Probability(0.5);
        Probability actual = p1.xor(p2);
        Probability expected = new Probability(0.5);
        assertEquals(expected, actual);

    }
}
