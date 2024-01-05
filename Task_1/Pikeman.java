package Task_1;

/*
копейщик аттакует в ближнем бою
 */
public class Pikeman extends Hero {
    public Pikeman (String nameHero) {
        super(100,
                100,
                0,
                new int []{0,0},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Копейщик: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }
}
