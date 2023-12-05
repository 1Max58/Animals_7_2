package com.example.animals;

public class Blowfish extends Fish implements AnimalBehavior {
    public String blowfishSpeciesKorsun64068;
    public Blowfish() {
        super();
        blowfishSpeciesKorsun64068 = "";
    }

    public Blowfish(String n, boolean fw, String s) {
        super(n, fw);
        blowfishSpeciesKorsun64068 = s;
    }

    public Blowfish(String n) {
        super(n, false);
        blowfishSpeciesKorsun64068 = "Blowfish spp.";
    }

    public void prick() {
        System.out.println("Blowfish " + getNameKorsun64068() + " pricks");
    }

    @Override
    public void sleepKorsun64068() {
        System.out.println("Blowfish " + getNameKorsun64068() + " sinks to the bottom and sleeps");
    }
}
