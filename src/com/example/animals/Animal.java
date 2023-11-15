package com.example.animals;

public abstract class Animal {
    private String nameKorsun64068;
    private int ageKorsun64068;
    private Float weightKorsun64068;

    public abstract void eatKorsun64068();
    public abstract void getVoidKorsun64068();

    public String toString() {
        return "Animal " + nameKorsun64068 + ", " + ageKorsun64068 + " years old and weighs " + String.format("%.3f kg", weightKorsun64068);
    }

    public String getNameKorsun64068() {
        return nameKorsun64068;
    }

    public void setNameKorsun64068(String nameKorsun64068) {
        this.nameKorsun64068 = nameKorsun64068;
    }

    public String getAgeKorsun64068() {
        return ageKorsun64068;
    }

    public void setAgeKorsun64068(String ageKorsun64068) {
        this.ageKorsun64068 = ageKorsun64068;
    }

    public String getWeightKorsun64068() {
        return weightKorsun64068;
    }

    public void setWeightKorsun64068(String weightKorsun64068) {
        this.weightKorsun64068 = weightKorsun64068;
    }
}
