package zooVersion2.animal;

import java.util.Random;
import zooVersion2.person.Person;

public class Animal {
    private String name;
    private String type;
    private boolean quarantine;
    public int biteCount = 0;
    private int foodCount = 0;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsolation() {
        return (new Random()).nextBoolean();
    }

    public boolean getQuarantine() {
        return this.quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public int getFoodCount() {
        return this.foodCount;
    }

    public void setFoodCount() {
        this.foodCount++;
    }

    public boolean getHungry() {
        return (new Random()).nextBoolean();
    }

    public void bite(Person person, Animal animal) {
        boolean random = (new Random()).nextBoolean();
        if (random) {
            person.setDamage(true);
            System.out.println(person.getPosition() + " укушен. Необходима перевязка");
            ++this.biteCount;
        } else {
            person.setDamage(false);
            System.out.println(person.getPosition() + " не был укушен. Продолжаем обход");
        }

    }

    public Animal() {
    }
}
