package com.example.animals;

public class Blowfish extends Fish {
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
}
