package Task_1;

public class Vector2 {
    int posX, posY;

    public Vector2(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public float rangeEnemy(Vector2 posEnemy){
        double distance = (float) Math.sqrt(Math.pow(posX - posEnemy.posX, 2) + Math.pow(posY-posEnemy.posY, 2));
        return (float) distance;
    }
}
