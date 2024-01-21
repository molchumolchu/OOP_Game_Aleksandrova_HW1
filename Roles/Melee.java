package Roles;

import Task_1.Hero;
import Interfaces.Hit;
import Task_1.Vector2;

import java.util.ArrayList;
import java.util.Random;

public abstract class Melee extends Hero {
    int damagePoint;
    private static Random rand = new Random();

    public Melee(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY, int step) {
        super(health, healthMax, armor, damage, nameHero, posX, posY, step);
        initiative = 2;
    }

//    public boolean hit(Hero other) {
//        if (other.isDead()) {
//            return false;
//        } else if (other.getLocation().getX() == this.getLocation().getX() && Math.abs(other.getLocation().getY() - this.getLocation().getY()) < 1.5) {
//            other.receiveDamage(rand.nextInt(this.damage[0], this.damage[1]));
//            return true;
//        } else {
//            return false;
//
//        }
//    }

    public void getDamage (Hero target) {
        if (this.position.rangeEnemy(target.position)<2){
            damagePoint= random.nextInt(damage[0], damage[1]);
            target.health = target.health -damagePoint;
        }
        else {
            System.out.println("Where am I?");
        }
    }

    public Hero findBestEnemy(ArrayList<Hero> enemies){
        Hero hero = enemies.get(0);
        for (int i = 0; i < enemies.size(); i++) {
            if(this.position.rangeEnemy(enemies.get(i).position)<this.position.rangeEnemy(hero.position)&&enemies.get(i).health >0){
                hero=enemies.get(i);
            }
        }
        return hero;
    }


    public Vector2 getStep (Hero enemy){
//        Hero tmp = findBestEnemy(enemies);
        Vector2 delta = position.getDelta(enemy.position);
        Vector2 tempV2 = new Vector2(position.posX, position.posY);

        if (delta.posX<0){
            tempV2.posX++;
            return tempV2;
        }
        if (delta.posX>0){
            tempV2.posX--;
            return tempV2;
        }
        if (delta.posY<0){
            tempV2.posY++;
            return tempV2;
        }
        if (delta.posY>0){
            tempV2.posY--;
            return tempV2;
        }
        return tempV2;

    }


    @Override
    public void step(ArrayList<Hero> enemies, ArrayList<Hero> alliase) {
        if (this.health==0) return;
        Hero tmp = findBestEnemy(enemies);
        if (position.rangeEnemy(tmp.position)<2){
            getDamage(tmp);
            System.out.println("Get damage!" + this.damagePoint);
        }
        else{
            Vector2 tmpV=getStep(tmp);
            boolean step = true;
            for (Hero hero: alliase) {
                if (!tmpV.equals(hero.position)) step=false ;

            }
            if (step) position=tmpV;
            getStep(tmp);
        }
//        getDamage(findBestEnemy(enemies));


    }
}

