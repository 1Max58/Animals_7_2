package com.example.animals;

public class Main {
    public static void main(String[] args) {
        Dog dogKorsun64068 = new Dog("K9", "German Shepherd");
        Blowfish blowfishKorsun64068 = new Blowfish("Nemo", false, "Fugu");
        Pigeon pigeonKorsun64068 = new Pigeon("Jake", 1, 0.100f, "White", "European White Pigeon");
        Animal[] animalsKorsun64068 = new Animal[] {
                dogKorsun64068,
                blowfishKorsun64068,
                pigeonKorsun64068
        };
        for (var animalKorsun64068 : animalsKorsun64068) {
            animalKorsun64068.eatKorsun64068();
            animalKorsun64068.getVoiceKorsun64068();
        }
        dogKorsun64068.run();
        dogKorsun64068.barkKorsun64068();
        blowfishKorsun64068.swimKorsun64068();
        blowfishKorsun64068.prick();
        pigeonKorsun64068.flapWingsKorsun64068();
        pigeonKorsun64068.flyKorsun64068();
    }
}
