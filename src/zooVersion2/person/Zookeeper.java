package zooVersion2.person;

import zooVersion2.animal.Animal;
import zooVersion2.animal.Cat;
import zooVersion2.animal.Hippo;

public class Zookeeper extends Person {
    public Zookeeper() {
    }

    public void giveFood(Animal animal) {
        System.out.println(getPosition() + " кормит животное: " + animal.getType() + " " + animal.getName());
        if (animal.getHungry()) {
            animal.setFoodCount();
            System.out.println(animal.getName() + " накормлен");
        } else {
            System.out.println(animal.getName() + " не голоден");
        }
    }

    public void removeWool(Cat cat) {
        System.out.println(getPosition() + " проверяет шерсть кошки: " + cat.getType() + " " + cat.getName());
        if (cat.getWool()) {
            cat.setWoolCount();
            System.out.println("Кошку необходимо вычесать. " + this.getPosition() + " приступает к работе");
            System.out.println(cat.getName() + " вычесан с ног до головы");
        } else {
            System.out.println(cat.getName() + " не нуждается в вычесывании шерсти");
        }
    }

    public void changeWater(Hippo hippo) {
        System.out.println(getPosition() + " проверяет воду в бассейне у животного " + hippo.getType() + " " + hippo.getName());
        if (!hippo.getWater()) {
            System.out.println("Необходима замена воды. " + this.getPosition() + " меняет воду");
            hippo.setWaterCount();
            System.out.println(hippo.getName() + " плещется в свежей воде");
        } else {
            System.out.println("Замена воды не требуется");
        }
    }
}
