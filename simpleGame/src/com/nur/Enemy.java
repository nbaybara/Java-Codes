package com.nur;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Enemy extends Charecter  implements EnemyCharecterB {
    public Enemy(String name, int health, int defense) {
        super(name, health, defense);
        rand=new Random();
    }
    public void darkSideAttackTo(Charecter ch)
    {
        int health = ch.getHealth();
        int hit = ThreadLocalRandom.current().nextInt(45,85);
        health -= hit ;
        ch.setHealth(health);
    }
    public void attackTo(Charecter ch)
    {
        int health = ch.getHealth();
        int hit = rand.nextInt(10);
        health -=hit ;
        this.score +=hit ;

    }
    public void defense()
    {
        int def = rand.nextInt(10);
        int h =this.getHealth();
        h+=def ;
        this.setHealth(h);
    }
}
