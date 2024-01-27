package Task_1;

import Roles.Melee;

import java.util.ArrayList;

/*
копейщик аттакует в ближнем бою
 */
public class Pikeman extends Melee {

    public Pikeman(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20, 30}, nameHero, posX, posY, 1);
        Vector2 position;
    }

    @Override
    public String toString() {
        return ("Копейщик: " + super.toString());
    }
    @Override
    public String getInfo() {
        return "Копейщик";
    }
}