package zooVersion2.animal;

import java.util.Random;

public class Hippo extends Animal {
    private int waterCount = 0;

    public Hippo() {
    }

    public Boolean getWater() {
        return (new Random()).nextBoolean();
    }

    public int getWaterCount() {
        return this.waterCount;
    }

    public void setWaterCount() {
        this.waterCount++;
    }
}
