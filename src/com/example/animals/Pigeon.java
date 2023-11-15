package com.example.animals;

public class Pigeon extends Bird {
    private String speciesKorsun64068;

    public Pigeon() {
        speciesKorsun64068 = "";
    }

    public Pigeon(String n, int a, float w, String f, String s) {
        super(n, a, w, f);
        speciesKorsun64068 = s;
    }

    public Pigeon(String n, String s) {
        super(n, "Gray");
        speciesKorsun64068 = s;
    }
    public void flyKorsun64068() {
        System.out.println("Pigeon " + getNameKorsun64068() + " flies");
    }

    @Override
    public String toString() {
        return super.toString() + ", it is a " + speciesKorsun64068 + " Pigeon";
    }

    public String getSpeciesKorsun64068() {
        return speciesKorsun64068;
    }

    public void setSpeciesKorsun64068(String speciesKorsun64068) {
        this.speciesKorsun64068 = speciesKorsun64068;
    }
}
