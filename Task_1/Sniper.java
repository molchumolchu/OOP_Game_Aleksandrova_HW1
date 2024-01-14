package Task_1;

import Roles.Archer;

import java.util.ArrayList;

/*
стрелок стреляет, не двигается
 */
public class Sniper extends Archer {

    public Sniper(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10,15}, nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Cнайпер: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }

}
