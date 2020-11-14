package com.company;

public class Main {

    public static void main(String[] args) {
        Severus severus = new Severus(100, 50, 50, Spells.SEKTUMSEMPRA
                , new Shelter("DOUBLE SHOT"));
        HarryPotter harryPotter = new HarryPotter(50, 15, Spells.PATRONUM, 20,
                165, new Shelter("DOUBLE HEAL"));
        HarryPotter harryPotter1 = new HarryPotter(100, 30, Spells.AVADAKIDABRA, 5,
                175, new Shelter("DOUBLE SUPER MEGA ULTRA HEAAAAAL"));


        System.out.println(severus.getInfo());
        System.out.println("----------------------------------------");
        System.out.println(harryPotter.getInfo());
        System.out.println("----------------------------------------");
        System.out.println(harryPotter1.getInfo());
        System.out.println("----------------------------------------");

        severus.makeVoice(1, "Meow");

        severus.makeVoice("Hello", 1);


    }
}