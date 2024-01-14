package Task_1;

import Roles.Support;

import java.util.ArrayList;

/*
безлимитная мана, не двигается
 */
public class Monk extends Support {


    public Monk(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{-30,-30}, nameHero, posX, posY);
    }

    protected Vector2 position;
    @Override
    public String toString() {

        return ("Монах: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }


}
