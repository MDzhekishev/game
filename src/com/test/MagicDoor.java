package com.test;

public class MagicDoor {


    public Hero[] getHeroes() {
        Hero Warrior = new Hero(250, 20, "CriticalDamage");
        Hero Mag = new Hero(250, 20, "Freeze");
        Hero Healer = new Hero(200, 0, "MassHeal");
        Hero Kinetic = new Hero(250, 20, "AttackOff");
        return new Hero[3];
    }
}
