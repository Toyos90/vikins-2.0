package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public String name;
    public String msg;

    public Saxon(int health, int strength) {
        super(health, strength);
    }

    public Saxon(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health > 0) {
            this.msg = this.name + " has received " + damage + " points of damage";
        } else {
            this.msg = this.name + " has died in act of combat";
        }
    }

    public String battleCry() {
        return "Odin Owns You All!";
    }

    public String getMsg() {
        return this.msg;
    }
}
