package Roles;

import Interfaces.Shoot;
import Task_1.Hero;

import java.util.ArrayList;
import java.util.Random;

public abstract class Archer extends Hero implements Shoot {
    protected static Random random=new Random();
    protected int ammoParts = 70;


    public Archer(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY, int step) {
        super(health, healthMax, armor, damage, nameHero, posX, posY, step);
        initiative=3;
    }

    public boolean shoot(Hero other) {
        if (this.ammoParts >= 10) {
            other.receiveDamage(random.nextInt(this.damage[0], this.damage[1]));
            this.ammoParts -= 10;
            return true;
        } else {
            System.out.println("Стрелы закончились!");
            return false;
        }
    }

    public void receiveAmmo(int amount) {
        this.ammoParts -= amount;
    }

    public Hero findClosestEnemy(ArrayList<Hero> enemies) {
        float minDistance = this.position.rangeEnemy(((Hero)enemies.get(0)).getLocation());
        Hero closest = (Hero)enemies.get(0);

        for(int i = 1; i < enemies.size(); ++i) {
            float distance = ((Hero)enemies.get(i)).getLocation().rangeEnemy(this.getLocation());
            if (distance < minDistance && !enemies.get(i).isDead()) {
                minDistance = distance;
                closest = (Hero)enemies.get(i);
            }
        }
        return closest;
    }

    @Override
    public void step(ArrayList<Hero> enemies, ArrayList<Hero> alliace) {
        if (isDead()) return;
        Hero other = findClosestEnemy(enemies);
        if (shoot(other)){
            receiveAmmo(10);
        }
    }

//    @Override
//    public void step(ArrayList<Hero> enemies) {
//        if(this.health==0||this.quantatyShoots==0) return;
//        Hero target = findClosestEnemy(enemies);
//        target.getDamage1((this.position.rangeEnemy(target.position)<rangeMaxDamage)? random.nextInt(damage[0], damage[1]):damage[0]);
//
//        System.out.println("Get damage" + this.);
//
//    }
}


