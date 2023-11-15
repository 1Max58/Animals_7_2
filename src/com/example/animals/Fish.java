package com.example.animals;

public class Fish extends Animal {
    private boolean isFreshwaterKorsun64068;

    public Fish() {
        super();
        isFreshwaterKorsun64068 = false;
    }

    public Fish(String n, int a, float w, boolean fw) {
        super(n, a, w);
        isFreshwaterKorsun64068 = fw;
    }

    public Fish(String n, boolean fw) {
        super(n);
        isFreshwaterKorsun64068 = fw;
    }

    @Override
    public String toString() {
        return super.toString() + ", it is " + (isFreshwaterKorsun64068 ? "freshwarer" : "saltwater") + " Fish";
    }

    @Override
    public void eatKorsun64068() {
        System.out.println("Fish " + getNameKorsun64068() + " eats");
    }

    @Override
    public void getVoiceKorsun64068() {
        System.out.println("Fish " + getNameKorsun64068() + " gives no voice");
    }

    public void swim() {
        System.out.println("Fish " + getNameKorsun64068() + " swims");
    }

    public boolean isFreshwaterKorsun64068() {
        return isFreshwaterKorsun64068;
    }

    public void setFreshwaterKorsun64068(boolean freshwater) {
        isFreshwaterKorsun64068 = freshwater;
    }
}
