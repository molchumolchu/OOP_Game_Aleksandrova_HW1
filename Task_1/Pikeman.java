package Task_1;

import Roles.Melee;

import java.util.ArrayList;

/*
копейщик аттакует в ближнем бою
 */
public class Pikeman extends Melee {

    public Pikeman(String nameHero, int posX, int posY) {
        super(100, 100, 0, new int[]{0,0}, nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Копейщик: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }

}
