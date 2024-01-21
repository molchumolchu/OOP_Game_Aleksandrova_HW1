package Task_1;

import Roles.Support;

import java.util.ArrayList;

/*
Маг - аналог монаха
 */
public class Wizard extends Support {

    public Wizard(String nameHero, int posX, int posY) {
        super(50, 50, 1, new int[]{-35,-30}, nameHero, posX, posY, 2);
    }
    protected Vector2 position;

    @Override
    public String toString() {
        return ("Колдун: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }

}
