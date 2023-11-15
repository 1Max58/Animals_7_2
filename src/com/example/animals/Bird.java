package com.example.animals;

public class Bird extends Animal {
    private String featherColorKorsun64068;

    public Bird() {
        featherColorKorsun64068 = "";
    }

    public Bird(String n, int a, float w, String f) {
        super(n, a, w);
        featherColorKorsun64068 = f;
    }
    public Bird(String n, String f) {
        super(n);
        featherColorKorsun64068 = f;
    }

    @Override
    public void eatKorsun64068() {
        System.out.println("Bird " + getNameKorsun64068() + " eats grains");
    }

    @Override
    public void getVoiceKorsun64068() {
        System.out.println("Bird " + getNameKorsun64068() + " gives voice");
    }

    @Override
    public String toString() {
        return super.toString() + ", it is a Bird with " + featherColorKorsun64068 + " feathers";
    }

    public void flapWingsKorsun64068() {
        System.out.println("Bird " + getNameKorsun64068() + " flaps its wings");
    }

    public String getFeatherColorKorsun64068() {
        return featherColorKorsun64068;
    }

    public void setFeatherColorKorsun64068(String featherColorKorsun64068) {
        this.featherColorKorsun64068 = featherColorKorsun64068;
    }
}
