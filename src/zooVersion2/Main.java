package zooVersion2;

import zooVersion2.animal.Cat;
import zooVersion2.animal.Hippo;
import zooVersion2.animal.Squirrel;
import zooVersion2.person.Vet;
import zooVersion2.person.Zookeeper;

public class Main {

    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        zookeeper.setPosition("Смотритель");

        Vet vet = new Vet();
        vet.setPosition("Ветеринар");

        Cat lion = new Cat();
        lion.setType("Лев");
        lion.setName("Кузя");

        Cat tiger = new Cat();
        tiger.setType("Тигр");
        tiger.setName("Жора");

        Hippo hippo = new Hippo();
        hippo.setType("Бегемот");
        hippo.setName("Дося");

        Squirrel strelka = new Squirrel();
        strelka.setType("Белка");
        strelka.setName("Стрелка");

        Squirrel lovkach = new Squirrel();
        lovkach.setType("Белка");
        lovkach.setName("Ловкач");

        while (lion.getFoodCount() < 2
                || tiger.getFoodCount() < 2
                || hippo.getFoodCount() < 2
                || strelka.getFoodCount() < 2
                || lovkach.getFoodCount() < 2
                || hippo.getWaterCount() < 1) {
            checkLion(vet, lion);
            checkTiger(vet, tiger);
            checkHippo(vet, hippo);
            checkStrelka(vet, strelka);
            checkLovkach(vet, lovkach);
            outWoolLion(zookeeper, vet, lion);
            outWoolTiger(zookeeper, vet, tiger);
            if (lion.getFoodCount() < 2) {
                foodLion(zookeeper, vet, lion);
            } else if (tiger.getFoodCount() < 2) {
                foodTiger(zookeeper, vet, tiger);
            } else if (hippo.getFoodCount() < 2) {
                foodHippo(zookeeper, vet, hippo);
            } else if (strelka.getFoodCount() < 2) {
                foodStrelka(zookeeper, vet, strelka);
            } else if (lovkach.getFoodCount() < 2) {
                foodLovkach(zookeeper, vet, lovkach);
            } else if (hippo.getWaterCount() < 1) {
                refreshPool(zookeeper, vet, hippo);
            }
        }

        showResult(vet, lion, tiger, hippo, strelka, lovkach);
    }

    private static void showResult(Vet vet, Cat lion, Cat tiger, Hippo hippo, Squirrel strelka, Squirrel lovkach) {
        System.out.println("КОНЕЦ РАБОЧЕГО ДНЯ.\nИТОГИ:");
        System.out.println(lion.getType() + " " + lion.getName() + " накормлен " + lion.getFoodCount() + " раз и вычесан " + lion.getWoolCount() + " раз");
        System.out.println(tiger.getType() + " " + tiger.getName() + " накормлен " + tiger.getFoodCount() + " раз и вычесан " + tiger.getWoolCount() + " раз");
        System.out.println(hippo.getType() + " " + hippo.getName() + " накормлен " + hippo.getFoodCount() + " раз и получил свежую воду " + hippo.getWaterCount() + " раз");
        System.out.println(strelka.getType() + " " + strelka.getName() + " накормлен " + strelka.getFoodCount() + " раз и сбежал " + strelka.getRunCount() + " раз");
        System.out.println(lovkach.getType() + " " + lovkach.getName() + " накормлен " + lovkach.getFoodCount() + " раз");
        System.out.println("Сделано перевязок: " + vet.getBandageCount());
    }

    private static void outWoolTiger(Zookeeper zookeeper, Vet vet, Cat tiger) {
        zookeeper.removeWool(tiger);
        tiger.bite(zookeeper, tiger);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void outWoolLion(Zookeeper zookeeper, Vet vet, Cat lion) {
        zookeeper.removeWool(lion);
        lion.bite(zookeeper, lion);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void refreshPool(Zookeeper zookeeper, Vet vet, Hippo hippo) {
        zookeeper.changeWater(hippo);
        hippo.bite(zookeeper, hippo);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void foodLovkach(Zookeeper zookeeper, Vet vet, Squirrel lovkach) {
        zookeeper.giveFood(lovkach);
        lovkach.bite(zookeeper, lovkach);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void foodStrelka(Zookeeper zookeeper, Vet vet, Squirrel strelka) {
        zookeeper.giveFood(strelka);
        strelka.runAway(zookeeper, strelka);
        strelka.bite(zookeeper, strelka);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void foodHippo(Zookeeper zookeeper, Vet vet, Hippo hippo) {
        zookeeper.giveFood(hippo);
        hippo.bite(zookeeper, hippo);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void foodTiger(Zookeeper zookeeper, Vet vet, Cat tiger) {
        zookeeper.giveFood(tiger);
        tiger.bite(zookeeper, tiger);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void foodLion(Zookeeper zookeeper, Vet vet, Cat lion) {
        zookeeper.giveFood(lion);
        lion.bite(zookeeper, lion);
        vet.bandage(zookeeper);
        System.out.println();
    }

    private static void checkLovkach(Vet vet, Squirrel lovkach) {
        vet.checkHealth(lovkach);
        lovkach.bite(vet, lovkach);
        vet.bandage(vet);
        System.out.println();
    }

    private static void checkStrelka(Vet vet, Squirrel strelka) {
        vet.checkHealth(strelka);
        strelka.runAway(vet, strelka);
        if (strelka.getRun()) {
            strelka.catchSquirrel();
        }

        strelka.bite(vet, strelka);
        vet.bandage(vet);
        System.out.println();
    }

    private static void checkHippo(Vet vet, Hippo hippo) {
        vet.checkHealth(hippo);
        hippo.bite(vet, hippo);
        vet.bandage(vet);
        System.out.println();
    }

    private static void checkTiger(Vet vet, Cat tiger) {
        vet.checkHealth(tiger);
        tiger.bite(vet, tiger);
        vet.bandage(vet);
        System.out.println();
    }

    private static void checkLion(Vet vet, Cat lion) {
        vet.checkHealth(lion);
        lion.bite(vet, lion);
        vet.bandage(vet);
        System.out.println();
    }
}