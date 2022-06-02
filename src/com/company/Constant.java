package com.company;

public class Constant extends Thing {
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    double value;

    @Override
    public boolean equals(Thing b) {
        return false;
    }
}
