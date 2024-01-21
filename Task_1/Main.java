package Task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
//import java.util.Random;


public class Main {

    static ArrayList<Hero> heroesWhite= new ArrayList<>();
    static ArrayList<Hero> heroesBlack= new ArrayList<>();


    public static void main(String[] args) {
        heroesWhite = generateCommande(0,0);
        heroesBlack = generateCommande(3,9);

        ArrayList<Hero> heroOrder = new ArrayList<>();
        heroOrder.addAll(heroesWhite);
        heroOrder.addAll(heroesBlack);
        heroOrder.sort((o1,o2)->o2.getInitiative()-o1.getInitiative());



        heroesWhite.forEach(n-> System.out.println(n.toString()));
        System.out.println("---");
        heroesBlack.forEach(n-> System.out.println(n.toString()));
        System.out.println("---");
//        heroesBlack.forEach(n-> n.printEnemyDistance(heroesWhite));


//        Crossbower hero1=new Crossbower("Man", 1,1);
//        System.out.println(hero1.getEnemyDist(heroesBlack));
//        hero1.currentDemage(hero1.getEnemyDist(heroesBlack), hero1);



//        heroesWhite.forEach(n-> n.step(heroesBlack));

        heroOrder.forEach(n-> System.out.println(n.getInitiative()));
        System.out.println("---");
        for (Hero h: heroOrder) {
            if(heroesBlack.contains(h)){
                h.step(heroesWhite, heroesBlack);
            }
            else h.step(heroesBlack, heroesWhite);
        }
        for (Hero h: heroOrder) {
            if(heroesBlack.contains(h)){
                h.step(heroesWhite, heroesBlack);
            }
            else h.step(heroesBlack, heroesWhite);
        }
        for (Hero h: heroOrder) {
            if(heroesBlack.contains(h)){
                h.step(heroesWhite, heroesBlack);
            }
            else h.step(heroesBlack, heroesWhite);
        }
//        heroOrder.forEach(n->System.out.println(n.getInitiative()));
//        heroesWhite.forEach(n-> n.step(heroesBlack));
        System.out.println("---");
//        heroesBlack.forEach(System.out::println);
        heroesWhite.forEach(System.out::println);
        System.out.println("---");
        heroesBlack.forEach(System.out::println);
    }


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
