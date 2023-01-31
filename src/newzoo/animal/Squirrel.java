package newzoo.animal;

import java.util.Random;

public class Squirrel extends Animal {

    private boolean isRun;

    // конструктор
    public Squirrel(String name) {
        super(name);
    }

    // метод побега белки Стрелки
    public void runAway() {
        int randomRun = new Random().nextInt(1, 100);
        if (randomRun > 50) {
            System.out.println("Белка " + getAnimalName() + " убежала");
            setStatusRun(true);
        } else {
            System.out.println("Белка " + getAnimalName() + " не убежала");
            setStatusRun(false);
        }
    }

    // геттер статуса побега белки Стрелки
    public boolean getStatusRun() {
        return isRun;
    }

    // сеттер статуса побега белки Стрелки
    public void setStatusRun(boolean statusRun) {
        isRun = statusRun;
    }
}
