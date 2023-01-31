package zooVersion2.animal;

import java.util.Random;

public class Cat extends Animal {
    private int woolCount = 0;

    public Cat() {
    }

    public boolean getWool() {
        return (new Random()).nextBoolean();
    }

    public int getWoolCount() {
        return this.woolCount;
    }

    public void setWoolCount() {
        this.woolCount++;
    }
}
