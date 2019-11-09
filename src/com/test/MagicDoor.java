package com.test;

public class MagicDoor {


    public Hero[] getHeroes() {

        Hero [] heroes = new Hero[4];
        Hero Warrior = new Hero(250,20,"CriticalDamage");
        heroes [0]= Warrior;
        Hero Mag = new Hero(250,20,"Freeze");
        heroes [1]= Mag;
        Hero Kinetic = new Hero(250,20,"AttackOff");
        heroes [2]= Kinetic;
        Hero Healer = new Hero(200,0,"MassHeal");
        heroes [3]=Healer;
        return heroes;

    }

}
