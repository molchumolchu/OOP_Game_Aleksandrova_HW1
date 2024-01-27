package Task_1;

import Roles.Melee;

import java.util.ArrayList;

/*
разбойник аттакует
 */
public class Rogue extends Melee {


    public Rogue(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20, 30}, nameHero, posX, posY, 1);
        Vector2 position;
    }

    @Override
    public String toString() {
        return ("Разбойник: " + super.toString());
    }

    @Override
    public String getInfo() {
        return "Разбойник";
    }
}