package Task_1;

/*
крестьянин, не может лечиться, носит стрелы для арбалетчика и снайпера
 */
public class Peasant extends Hero {
    public Peasant (String nameHero) {
        super(100,
                100,
                0,
                new int []{0,0},
                nameHero);
    }

    @Override
    public String toString() {
        return ("Крестьянин: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }
}
