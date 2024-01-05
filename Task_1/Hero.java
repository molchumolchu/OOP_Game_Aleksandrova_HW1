package Task_1;

import java.util.Random;

//* Monk heal unlimited mana cant move
//        * Crossbower cant move shot
//        * Pikeman move front-side attack mellee
//        * Wizard - monk analogy
//        * Sniper cb analog shot cant move
//        * Rogue move attack
//        * Peasant cant move cant heal carry bows for cb and sniper
abstract public class Hero {
    protected int health, healthMax, armor;
    protected int[] damage;
    protected String nameHero;


    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
    }

    protected static Random r;

    public void GetDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
    }

    public void Attack(Hero target) {
        int damage = Hero.r.nextInt(0, 10);
        target.GetDamage(damage);
    }

}
