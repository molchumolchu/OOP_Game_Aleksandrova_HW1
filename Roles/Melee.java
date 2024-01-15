package Roles;

import Task_1.Hero;
import Interfaces.Hit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Melee extends Hero implements Hit {

    private static Random rand = new Random();
    public Melee(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
        super(health, healthMax, armor, damage, nameHero, posX, posY);
        initiative=2;
    }

    public boolean hit(Hero other) {
        if (other.isDead()) {
            return false;
        } else if (other.getLocation().getX() == this.getLocation().getX() && Math.abs(other.getLocation().getY() - this.getLocation().getY()) == 1) {
            other.receiveDamage(rand.nextInt(this.damage[0], this.damage[1]));
            return true;
        } else {
            return false;
        }
    }


}
