package Task_1;

import java.util.ArrayList;
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



    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
    }


    protected Vector2 position;

    public void printEnemyDistance(ArrayList<Hero> enemys){
        enemys.forEach(n-> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }

    public Hero getEnemyDist (ArrayList<Hero> enemys){
        Hero minDist = null;
        Hero nearestEnemy= enemys.get(0);
        for(int i=0; i<enemys.size()-1; i++){
            if (position.rangeEnemy(enemys.get(i).position)>=position.rangeEnemy(enemys.get(i+1).position)){
                nearestEnemy=enemys.get(i+1);
            }
        }
        return nearestEnemy;
    }

    public int forceAttack(Hero hero){
        int attakMin = hero.damage[0];
        int attakMax = hero.damage[1]+1;
        return new Random().nextInt(attakMin, attakMax);
    }

    public void currentDemage(Hero nearestEnemy, Hero hero){
        int currentDamage = forceAttack(hero) - nearestEnemy.armor;
        if (currentDamage<=0){
            currentDamage = 0;
        }
        nearestEnemy.health= nearestEnemy.health-currentDamage;
        System.out.println(nearestEnemy);
    }





}
