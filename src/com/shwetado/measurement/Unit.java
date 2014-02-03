package com.shwetado.measurement;

public interface Unit {
    public Double getUnitValue();
    public Unit getGreaterUnit(Unit otherUnit);
}
