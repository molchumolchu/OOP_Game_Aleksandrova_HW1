package Task_1;

/*
крестьянин, не может лечиться, носит стрелы для арбалетчика и снайпера
 */
public class Peasant extends Hero {

    public Peasant(String nameHero, int posX, int posY) {
        super(100, 100, 0, new int[]{0,0}, nameHero, posX, posY);
    }
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Крестьянин: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor);
    }
}
