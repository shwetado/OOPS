package com.shwetado.volume;

public enum LiquidUnit {
    milliliter(1), liter(1000), kiloliter(1000000), gallons(3785.41);

    private double unitValue;

    LiquidUnit(double unitValue) {
        this.unitValue = unitValue;
    }

    public Double getValue() {
        return unitValue;
    }
}
