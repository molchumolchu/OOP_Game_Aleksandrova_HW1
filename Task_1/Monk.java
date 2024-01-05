package Task_1;

/*
безлимитная мана, не двигается
 */
public class Monk extends Hero {
    public Monk (String nameHero) {
        super(50,
                50,
                1,
                new int []{-30, -30},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Монах: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }
}
