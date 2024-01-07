package Task_1;

/*
разбойник аттакует
 */
public class Rogue extends Hero {


    public Rogue(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{5,10}, nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Разбойник: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }
}
