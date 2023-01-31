package zooVersion2.animal;

import java.util.Random;
import zooVersion2.person.Person;

public class Squirrel extends Animal {
    private boolean run;
    private int runCount = 0;

    public Squirrel() {
    }

    public void runAway(Person person, Squirrel squirrel) {
        boolean random = (new Random()).nextBoolean();
        if (random) {
            System.out.println(squirrel.getName() + " сбежал! Начинаем ловить");
            squirrel.setRun(true);
            this.runCount++;
        } else {
            System.out.println(squirrel.getName() + " не сбежал");
            squirrel.setRun(false);
        }

    }

    public boolean getRun() {
        return this.run;
    }

    public void setRun(Boolean run) {
        this.run = run;
    }

    public int getRunCount() {
        return this.runCount;
    }

    public void catchSquirrel() {
        boolean catchStatus = true;
        int catchCount = 1;

        while(catchStatus) {
            boolean chanceToCatch = (new Random()).nextBoolean();
            if (chanceToCatch) {
                System.out.println(catchCount + "-я попытка поймать белку Стрелку");
                System.out.println("Поймали! Можно возвращаться к работе");
                catchStatus = false;
            } else {
                System.out.println(catchCount + "-я попытка поймать белку Стрелку");
                System.out.println("Не поймали. Начинаем ловлю заново");
                catchStatus = false;
                catchCount++;
            }
        }
    }
}
