package Task_1;

/*
арбалетчик стреляет, не двигается
есть запас стрелл, определяет наименьшее растояние и наносит повреждение на всем поле. учитываь броню
 */
public class Crossbower extends Hero {


    public Crossbower(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10,15}, nameHero, posX, posY);
        this.rangeMaxDamage = 4;
//        this.arrowsCount = arrowsCount;

    }

    int rangeMaxDamage;
    int arrowsCount;
//    protected Vector2 position;

    @Override
    public String toString() {
        return ("Арбалетчик: "+nameHero + ", health: "+ health + "/" + healthMax + " броня: " + armor+ ", стрелы в наличии: "+arrowsCount);
    }



}
