package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier {

   String name;

   int health;

   int strength;
   private String msg;


   public Viking(String name, int health, int strength) {
      super(health, strength);
      this.name = name;
      this.health = health;
      this.strength = strength;
   }

   public int attack(){
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

   public String battleCry(){
      return "Odin Owns You All!";

   }

   public String getMsg(){
      return this.msg;
   }

   public int getStrength() {
      return strength;
   }
   public int getHealth() {
      return health;
   }

    public void setHealth(int health) {
        this.health = health;
    }

   public int getName() {
      this.name = name;
      return 0;
   }
}
