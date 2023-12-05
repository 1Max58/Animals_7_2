package com.example.animals;

public abstract class Mammal extends Animal {
    private int maxWeightKorsun64068;

    public Mammal() {
        super();
        maxWeightKorsun64068 = 0;
    }

    public Mammal(String n, int a, float w, int mw) {
        super(n, a, w);
        maxWeightKorsun64068 = mw;
    }

    public Mammal(String n, int mw) {
        super(n);
        maxWeightKorsun64068 = mw;
    }

    public void runKorsun64068() {
        System.out.println("Mammal " + getNameKorsun64068() + " runs");
    }

    @Override
    public String toString() {
        return super.toString() + ", it is a Mammal up to " + maxWeightKorsun64068 + " kg";
    }
    public int getMaxWeightKorsun64068() {
        return maxWeightKorsun64068;
    }

    public void setMaxWeightKorsun64068(int maxWeightKorsun64068) {
        this.maxWeightKorsun64068 = maxWeightKorsun64068;
    }
}
