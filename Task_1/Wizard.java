package Task_1;

/*
Маг - аналог монаха
 */
public class Wizard extends Hero {
    public Wizard (String nameHero) {
        super(50,
                50,
                1,
                new int []{-35, -30},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Колдун: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }
}
