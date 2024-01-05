package Task_1;

/*
арбалетчик стреляет, не двигается
 */
public class Crossbower extends Hero {

    public Crossbower(String nameHero) {
        super(75,
                75,
                2,
                new int []{10,15},
                nameHero);
        rangeMaxDamage = 4;
        arrowsCount = 10;
    }
    int rangeMaxDamage;
    int arrowsCount;

    @Override
    public String toString() {
        return ("Арбалетчик: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor+ ", стрелы в наличии: "+arrowsCount);
    }

    public int Attack() {
        int damage = Hero.r.nextInt(5, 10);
        this.arrowsCount -= (int) (damage * 0.8);
        if (arrowsCount < 0)
            return 0;
        else
            return damage;
    }
}
