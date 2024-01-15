package Task_1;

/*
арбалетчик стреляет, не двигается
есть запас стрелл, определяет наименьшее растояние и наносит повреждение на всем поле. учитываь броню
 */

import Roles.Archer;

import java.util.ArrayList;

public class Crossbower extends Archer {


    public Crossbower(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10,15}, nameHero, posX, posY);
        this.rangeMaxDamage = 4;


    }

    int rangeMaxDamage;
    int arrowsCount=ammoParts;
//    protected Vector2 position;

    @Override
    public String toString() {
        return ("Арбалетчик: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor+ ", стрелы в наличии: "+ammoParts);
    }


}
