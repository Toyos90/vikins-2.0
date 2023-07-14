package org.example.soldier;

public class Soldier {

    int health;

    int strength;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack(){
        return this.strength;
    }

    public String receiveDamage(int damage){
        this.health-= damage;

        return null;
    }


}


