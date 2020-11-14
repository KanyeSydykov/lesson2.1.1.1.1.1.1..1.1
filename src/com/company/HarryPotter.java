package com.company;

public     final class  HarryPotter extends Severus {


    private int brightness;
    private Shelter shelter;

    public HarryPotter(int damage, int poison, Spells smartness, int double_shot, int brightness, Shelter shelter) {
        super(damage, poison, smartness, Spells.AVADAKIDABRA, double_shot);
        this.brightness = brightness;
        this.shelter = shelter;
    }







    public int getBrightness() {
        return brightness;
    }

    @Override
    public Shelter getShelter() {
        return shelter;
    }

    public String getInfo() {
    return "Severus = " +
            "\nSpell = " + getSpells() +
            "\nSmartness = " + getSmartness() +
            "\npoison = " + getPoison() +
            "\nsmartness = " + getSmartness() +
            "\nDamage = " + getDamage() +
            "\nShelter = " + getShelter();




}

}








