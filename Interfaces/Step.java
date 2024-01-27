package Interfaces;

import Task_1.Hero;

import java.util.ArrayList;

public interface Step {
    void gameStep(ArrayList<Hero> teamEnemy, ArrayList<Hero> teamAllias);
    //void gameStep(ArrayList<Hero> teamEnemy);

}
