package com.test;

import java.util.Random;

public class Boss {

    int bossHealth;
    int bossDamage;
    String bossDefense;

    public void changeBossDefense() {
        Random r = new Random();
        int randomIndex = r.nextInt();


    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefense() {
        return bossDefense;
    }

    public void setBossDefense(String bossDefense) {
        this.bossDefense = bossDefense;
    }
}
