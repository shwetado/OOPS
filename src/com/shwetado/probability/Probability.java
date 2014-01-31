package com.shwetado.probability;

public class Probability {
    private final double probability;

    public Probability(double probability) throws IllegalArgumentException {
        if (probability < 0 || probability > 1)
            throw new IllegalArgumentException();
        this.probability = probability;
    }

    public Probability and(Probability probability) {
        return new Probability(this.getValue() * probability.getValue());
    }

    public double getValue() {
        return this.probability;
    }

    public double not() {
        return 1 - this.probability;
    }

    public Probability or(Probability p2) {
        return new Probability(this.getValue() + p2.getValue() - this.and(p2).getValue());
    }

    public Probability xor(Probability p2) {
        return new Probability(this.or(p2).getValue() - this.and(p2).getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        return Double.compare(that.probability, probability) == 0;

    }
}
