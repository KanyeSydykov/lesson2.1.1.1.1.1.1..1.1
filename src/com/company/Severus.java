package com.company;

public class Severus  extends  Voldemort {
     private Spells spells;
    private int smartness;
    private int poison;
    private Shelter shelter;

    public Severus(int damage, int poison, int smartness, Spells avadakidabra, Shelter double_shot) {
        super(damage);
        this.poison = poison;
        this.shelter = shelter;
        this.smartness = smartness;


    }



    public int getPoison() {
        return poison;
    }

    public Shelter getShelter() {
        return shelter;
    }
   public int getSmartness(){
        return smartness;
   }

    public Spells getSpells() {
        return spells;
    }

    public void makeVoice(int num, String voice ){
        for (int i = 0; i <num ; i++) {
            System.out.println(voice);
        }

    }
   public String makeVoice(String voice, int num){
       for (int i = 0; i < num; i++) {
           System.out.println(voice);
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

}
