package com.nur;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    Charecter player = new Player("Hero" , 100 , 200)
    Charecter dragon = new Dragon("Dragon" , 90 , 210);
    boolean isGameOver =false ;
    List<Integer> scoreList = new ArrayList<Integer>();

    void LEttheGameBegin()
    {
        while(!isGameOver)
        {
            ((Player)player).attackTo(dragon);
            ((Dragon)dragon).defense();

            if(player.getHealth() <10)
                ((Player)player).lightSideAttackTo(dragon);
        }
    }

}
