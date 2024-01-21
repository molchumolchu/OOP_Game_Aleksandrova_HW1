package Roles;

import Interfaces.Heal;
import Task_1.Hero;

import java.util.ArrayList;
import java.util.Random;


public abstract class Support extends Hero implements Heal {

    private static Random random = new Random();
    public Support(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY, int step) {
        super(health, healthMax, armor, damage, nameHero, posX, posY, 1);
        initiative=1;
    }

    public boolean heal(Hero other) {
        if (other.isDead()) {
            return false;
        } else if (other.isInjured()) {
            other.getHeal(random.nextInt(this.damage[0], this.damage[1]+1));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void step(ArrayList<Hero> enemies, ArrayList<Hero>alliace) {
        if (isDead()) return;
        getHeal(5);
    }
}