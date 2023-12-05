package com.example.animals;

public class Dog extends Mammal implements AnimalBehavior {
    private String breedKorsun64068;

    public Dog() {
        super();
        breedKorsun64068 = "";
    }

    public Dog(String n, int a, float w, int mw, String s) {
        super(n, a, w, mw);
        breedKorsun64068 = s;
    }

    public Dog(String n, String s) {
        super(n, 40);
        breedKorsun64068 = s;
    }

    @Override
    public String toString() {
        return super.toString() + ", it is a Dog of the " + breedKorsun64068 + " breed";
    }

    public void barkKorsun64068() {
        System.out.println("Dog " + getNameKorsun64068() + " barks");
    }

    @Override
    public void eatKorsun64068() {
        System.out.println("Mammal " + getNameKorsun64068() + " eats meat");
    }

    @Override
    public void getVoiceKorsun64068() {
        barkKorsun64068();
    }

    public String getBreedKorsun64068() {
        return breedKorsun64068;
    }

    public void setBreedKorsun64068(String breedKorsun64068) {
        this.breedKorsun64068 = breedKorsun64068;
    }

    @Override
    public void sleepKorsun64068() {
        System.out.println("Dog " + getNameKorsun64068() + " lays down and sleeps");
    }
    @Override
    public void runKorsun64068() {
        System.out.println("Dog runs");
    }
    @Override
    public void moveKorsun64068() {
        runKorsun64068();
    }
}
