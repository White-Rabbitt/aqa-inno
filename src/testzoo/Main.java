package testzoo;

import testzoo.animal.Cats;
import testzoo.animal.Hippo;
import testzoo.animal.Squirrel;
import testzoo.people.Vet;
import testzoo.people.Zookeeper;

public class Main {
    public static void main(String[] args) {
        // Создаем смотрителя
        Zookeeper zookeeper = new Zookeeper();
        zookeeper.setName("Аркадий");
        zookeeper.setPosition("Смотритель");

        // Создаем ветеринара
        Vet vet = new Vet();
        vet.setName("Виктория");
        vet.setPosition("Ветеринар");

        // Создаем животных
        Cats lion = new Cats();
        lion.setType("Лев");
        lion.setName("Кузя");

        Cats tiger = new Cats();
        tiger.setType("Тигр");
        tiger.setName("Жора");

        Hippo hippo = new Hippo();
        hippo.setType("Бегемот");
        hippo.setName("Дося");

        Squirrel squirrelS = new Squirrel();
        squirrelS.setType("Белка");
        squirrelS.setName("Стрелка");

        Squirrel squirrelL = new Squirrel();
        squirrelL.setType("Белка");
        squirrelL.setName("Ловкач");

        System.out.println("Сотрудники: ");
        System.out.println(zookeeper.getPosition() + " " + zookeeper.getName());
        System.out.println(vet.getPosition() + " " + vet.getName());

        System.out.println("Животные: ");
        System.out.println(lion.getType() + " " + lion.getName());
        System.out.println(tiger.getType() + " " + tiger.getName());
        System.out.println(hippo.getType() + " " + hippo.getName());
        System.out.println(squirrelS.getType() + " " + squirrelS.getName());
        System.out.println(squirrelL.getType() + " " + squirrelL.getName());

        lion.setSick(true);
        tiger.setSick(false);
        hippo.setSick(false);
        squirrelS.setSick(false);
        squirrelL.setSick(false);

        // Осматриваем животных
        vet.checkHealth(lion);
        vet.checkHealth(tiger);
        vet.checkHealth(hippo);
        vet.checkHealth(squirrelS);
        vet.checkHealth(squirrelL);


        // Просыпается голод
        lion.setFullness(false);
        tiger.setFullness(false);
        hippo.setFullness(false);
        squirrelS.setFullness(false);
        squirrelL.setFullness(false);


        // Кормим первый раз
        zookeeper.feed(lion);
        zookeeper.feed(tiger);
        zookeeper.feed(hippo);
        zookeeper.feed(squirrelS);
        zookeeper.feed(squirrelL);

        // Вычесываем льва и тигра
        lion.setComb(false);
        tiger.setComb(false);

        zookeeper.combing(lion);
        zookeeper.combing(tiger);

        // Меняем воду
        hippo.setWater(false);
        zookeeper.changeWater(hippo);


        // Просыпается голод
        hippo.setFullness(false);
        squirrelS.setFullness(false);
        squirrelL.setFullness(false);

        // Кормим второй раз
        zookeeper.feed(lion);
        zookeeper.feed(tiger);
        zookeeper.feed(hippo);
        zookeeper.feed(squirrelS);
        zookeeper.feed(squirrelL);

        // Кусаем смотрителя
        tiger.bite(zookeeper, tiger);

        // Накладываем повязку
        vet.health(zookeeper);

        // Белка убегает
        squirrelS.setEscape(false);
        zookeeper.searchSquirrel(squirrelS, zookeeper);
        squirrelS.setDetection(true);
        zookeeper.searchSquirrel(squirrelS, zookeeper);

        // Проверяем льва
        lion.setSick(false);
        vet.checkHealth(lion);


    }
}
