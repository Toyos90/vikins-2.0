package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    int health;

    int strength;

    String msg;

    public Saxon(int health, int strength) {
        super(health, strength);
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
        return this.strength;
    }

    public String receiveDamage(int damage) {
        this.health -= damage;
        if (this.health > 0) {
            return "A Saxon has received " + damage + " points of damage";
        } else {
            return "A Saxon has died in combat";
        }


}
    public int getHealth() {
        return health;
    }
    public String getMsg(){
        return this.msg;
    }

    public void setHealth(int i) {
        this.health = i;
    }

    public int getStrength() {
        return this.strength;
    }
}


