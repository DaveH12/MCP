package com.company;

public class Asset extends Thing {
    String name;
    double original;
    double current;

    public Asset(String name, double original, double current) {
        this.name = name;
        this.original = original;
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginal() {
        return original;
    }

    public void setOriginal(double original) {
        this.original = original;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    @Override
    public boolean equals(Thing b) {
        if (b instanceof Asset) {
            return (current == ((Asset) b).current);
        }
        if (b instanceof Expense) {
            return (current == ((Expense) b).getAmount());
        }
        if (b instanceof Constant) {
            return (current == ((Constant) b).value);
        }
        return false;
    }
}
