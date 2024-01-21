package Task_1;

import Roles.Melee;

import java.util.ArrayList;

/*
разбойник аттакует
 */
public class Rogue extends Melee {


    public Rogue(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{5,10}, nameHero, posX, posY,2);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Разбойник: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }

//    @Override
//    public boolean hit(Hero var1) {
//        return false;
//    }
}
