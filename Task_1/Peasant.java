package Task_1;

import Roles.Archer;
import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Random;


/*
крестьянин, не может лечиться, носит стрелы для арбалетчика и снайпера
 */
public class Peasant extends Hero {
    private static Random rand = new Random();

    public Peasant(String nameHero, int posX, int posY) {
        super(100, 100, 0, new int[]{10,21}, nameHero, posX, posY, 1);

    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Крестьянин: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);

    }

    public boolean giveBows(Archer other) {
        if (other.isDead()) {
            return false;
        } else {
            int numGiven = rand.nextInt(this.damage[0], this.damage[1]+1);
            other.receiveAmmo(numGiven);
            String var10001 = this.nameHero;
            System.out.println(var10001 + " handed " + other.getName() + " " + (float)numGiven / 10.0F + " arrows");
            return true;
        }
    }

}
