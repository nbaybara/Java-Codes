package com.nur;

import java.util.concurrent.ThreadLocalRandom;

public class Player extends  Charecter implements PlayerCharecterBehaviour {
    public Player(String name, int health, int defense) {
        super(name, health, defense);
    }

    public void lightSideAttackTo(Charecter ch)
    {
        int health =ch.getHealth();
        int hit = ThreadLocalRandom.current().nextInt(50,90);
        health -=hit ;
        ch.setHealth(health);
    }
    public void attackTo(Charecter ch)
    {
        int health = ch.getHealth() ;
        int hit = rand.nextInt(15);
        health-=hit ;
        ch.setHealth(health);
        this.score += hit ;

    }
    public void defense()
    {
        int def = rand.nextInt(5);
        int h = this.getHealth();
        h+=def ;
        this.setHealth(h);
    }
}
