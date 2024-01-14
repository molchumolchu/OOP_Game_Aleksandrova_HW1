package Task_1;

import java.util.ArrayList;
import java.util.Random;


public class Main {

    public Main() {
    }
    public static void main(String[] args) {
        heroesWhite = generateCommande(0,0);
        heroesBlack = generateCommande(3,9);
//        heroesWhite.forEach(n-> System.out.println(n.toString()));
//        System.out.println("---");
//        heroesBlack.forEach(n-> System.out.println(n.toString()));
//        System.out.println("---");
//        heroesBlack.forEach(n-> n.printEnemyDistance(heroesWhite));


//        Crossbower hero1=new Crossbower("Man", 1,1);
//        System.out.println(hero1.getEnemyDist(heroesBlack));
//        hero1.currentDemage(hero1.getEnemyDist(heroesBlack), hero1);

        Sniper h1 = new Sniper("Artemisia Imbrex", 3, 4);
        h1.shoot(heroesWhite.get(2));
        System.out.println(heroesWhite.get(2));
        Monk h2 = new Monk("Bella Caudinus", 7, 9);
        h2.heal(heroesWhite.get(2));
        h2.heal(heroesWhite.get(2));
        h2.die();
        Peasant h3 = new Peasant("Claudius Pulcher", 2, 3);

        while(!h3.isDead()) {
            Hero ch = h1.findClosestEnemy(heroesBlack);
            System.out.println(ch.position.rangeEnemy(h1.getLocation()));
            if (ch.isDead()) {
                break;
            }

            while (!ch.isDead()) {
                while (h1.shoot(ch)) {
                    System.out.println(ch);
                }

                if (!h1.shoot(h3)) {
                    h3.giveBows(h1);
                    System.out.println(h3);
                }

                if (h3.isDead()) {
                    break;
                }
            }
        }
    }



    static ArrayList<Hero> heroesWhite= new ArrayList<>();
    static ArrayList<Hero> heroesBlack= new ArrayList<>();

    static ArrayList<Hero> generateCommande(int n, int y){

        ArrayList<Hero> commandHeroes = new ArrayList<>();

        Random random = new Random();
        int rsnd;
        for (int i = 0; i<10; i++){
            rsnd=random.nextInt(1,5)+n;
            switch (rsnd){
                case 1:
                    commandHeroes.add(new Crossbower(getName(), i, y));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName(), i, y));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName(), i, y));
                    break;
                case 3:
                    commandHeroes.add(new Pikeman(getName(), i, y));
                    break;
                case 5:
                    commandHeroes.add(new Rogue(getName(), i, y));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName(), i, y));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName(), i, y));
                    break;
            }
        }
        return commandHeroes;
    }
    static String getName(){
        return (NamesOfHeroes.values()[new Random().nextInt(NamesOfHeroes.values().length-1)].name());
    }

}
