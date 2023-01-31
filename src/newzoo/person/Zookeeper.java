package newzoo.person;

import java.util.Random;

public class Zookeeper extends Person {

    private int giveFood = 0;
    private int count = 0;

    public Zookeeper(String position) {
        super (position);
    }

    // метод дать еду
    public int giveFood(String name, int food) {
        return giveFood = food;
    }




}
