package Task_1;

/*
разбойник аттакует
 */
public class Rogue extends Hero {

    public Rogue(String nameHero) {
        super(100,
                100,
                5,
                new int []{5,10},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Разбойник: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }
}
