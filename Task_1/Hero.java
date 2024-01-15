package Task_1;

import Interfaces.Step;

import java.util.ArrayList;
import java.util.Random;

//* Monk heal unlimited mana cant move
//        * Crossbower cant move shot
//        * Pikeman move front-side attack mellee
//        * Wizard - monk analogy
//        * Sniper cb analog shot cant move
//        * Rogue move attack
//        * Peasant cant move cant heal carry bows for cb and sniper
abstract public class Hero implements Step {


    protected static Random random;
    protected int health, healthMax, armor;
    protected int[] damage;
    protected String nameHero;


    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
    }


    protected Vector2 position;

    public void printEnemyDistance(ArrayList<Hero> enemys) {
        enemys.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }

    public void die() {
        System.out.println(this.nameHero + " is dead.");
        this.position.posX = -11;
        this.position.posY = -11;
    }

    public void receiveDamage(int damage) {
        this.health -= damage - this.armor;
        if (this.health < 1) {
            this.die();
        }

    }

    public void getHeal(int power) {
        this.health += power;
        if (this.healthMax < this.health) {
            this.health = this.healthMax;
        }

    }

    public Vector2 getLocation() {
        return this.position;
    }

    public boolean isInjured() {
        return this.health > 0 && this.health < this.healthMax;
    }

    public boolean isDead() {
        return this.health < 1;
    }

    public String getName() {
        return this.nameHero;
    }

    @Override
    public void step(ArrayList<Hero> enemies) {
        System.out.println("Not implemented");
    }

    protected int initiative;

    public int getInitiative(){
        return initiative;
    }

}



