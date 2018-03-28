package com.nur;

import java.util.Random;

public class Charecter {
    private String name ;
    private int health ;
    private int defense ;
    protected int score ;
    protected Random rand ;

    public Charecter(String name, int health, int defense) {
        this.name = name;
        this.health = health;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void DisplayScore()
    {
        System.out.println(score);
    }
    public void DisplayHealth(){
        System.out.println(health);
    }
}
