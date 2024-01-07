package Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        heroesWhite = generateCommande(0,0);
        heroesBlack = generateCommande(3,9);
        heroesWhite.forEach(n-> System.out.println(n.toString()));
        System.out.println("---");
        heroesBlack.forEach(n-> System.out.println(n.toString()));
        System.out.println("---");
        heroesBlack.forEach(n-> n.printEnemyDistance(heroesWhite));

        Crossbower hero1=new Crossbower("Man", 1,1);
        System.out.println(hero1.getEnemyDist(heroesBlack));
        hero1.currentDemage(hero1.getEnemyDist(heroesBlack), hero1);

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
