package newzoo;

import newzoo.animal.Cat;
import newzoo.animal.Hippo;
import newzoo.animal.Squirrel;
import newzoo.person.Vet;
import newzoo.person.Zookeeper;

public class Main {
    public static void main(String[] args) {

        // создание экземпляров класса Squirrel
        Squirrel lovkach = new Squirrel("Ловкач");
        Squirrel strelka = new Squirrel("Стрелка");

        // создание экземпляров класса Cat
        Cat leo = new Cat("Кузя");
        Cat tiger = new Cat("Жора");

        Hippo hippo = new Hippo("Дося");

        // создание экземпляров класса Person
        Zookeeper zookeeper = new Zookeeper("Смотритель");
        Vet vet = new Vet("Ветеринар");

        while (leo.getLeoIsFed() < 2
                || tiger.getTigerIsFed() < 2
                || hippo.getHippoIsFed() < 2
                || lovkach.getLovkachIsFed() < 2
                || strelka.getStrelkaIsFed() < 2
                || hippo.getWater() < 1) {
            if (leo.getLeoIsFed() < 2
                    && tiger.getTigerIsFed() < 2
                    && hippo.getHippoIsFed() < 2
                    && lovkach.getLovkachIsFed() < 2
                    && strelka.getStrelkaIsFed() < 2) {
                checkLeo(leo, vet);
                checkTiger(tiger, vet);
                checkHippo(hippo, vet);
                checkLovkach(lovkach, vet);
                checkStrelka(strelka, vet);
                feedLeo(leo, zookeeper, vet);
                feedTiger(tiger, zookeeper, vet);
                feedHippo(hippo, zookeeper, vet);
                feedLovkach(lovkach, zookeeper, vet);
                feedStrelka(strelka, zookeeper, vet);
            }
            if (hippo.getWater() < 1) {
                refresPool(hippo, zookeeper, vet);
            } else {
                showResults(lovkach, strelka, leo, tiger, hippo, zookeeper, vet);
                break;
            }
        }
    }

    private static void checkLeo(Cat leo, Vet vet) {
        // Ветеринар проверяет льва Кузю
        vet.setPersonPosition("Ветеринар");
        System.out.println(vet.getPersonPosition() + " начал осмотр льва Кузя");
        vet.bitePerson();
        if (vet.getStatusBite() == true) {
            vet.bandage();
        }
        vet.checkHealth("Кузя", leo.getHealth(), vet.getStatusBite());
        System.out.println("В изоляторе находится: " + vet.animalInQuarantine[0]);
        System.out.println();
    }

    private static void checkTiger(Cat tiger, Vet vet) {
        // Ветеринар проверяет тигра Жору
        vet.setPersonPosition("Ветеринар");
        System.out.println(vet.getPersonPosition() + " начал осмотр тигра Жора");
        vet.bitePerson();
        if (vet.getStatusBite() == true) {
            vet.bandage();
        }
        vet.checkHealth("Жора", tiger.getHealth(), vet.getStatusBite());
        System.out.println("В изоляторе находится: " + vet.animalInQuarantine[1]);
        System.out.println();
    }

    public static void checkHippo(Hippo hippo, Vet vet) {
        // Ветеринар проверяет бегемота Досю
        vet.setPersonPosition("Ветеринар");
        System.out.println(vet.getPersonPosition() + " начал осмотр бегемота Дося");
        vet.bitePerson();
        if (vet.getStatusBite() == true) {
            vet.bandage();
        }
        vet.checkHealth("Кузя", hippo.getHealth(), vet.getStatusBite());
        System.out.println("В изоляторе находится: " + vet.animalInQuarantine[2]);
        System.out.println();
    }

    public static void checkLovkach(Squirrel lovkach, Vet vet) {
        // Ветеринар проверяет белку Ловкач
        vet.setPersonPosition("Ветеринар");
        System.out.println(vet.getPersonPosition() + " начал осмотр белки Ловкач");
        vet.bitePerson();
        if (vet.getStatusBite() == true) {
            vet.bandage();
        }
        vet.checkHealth("Ловкач", lovkach.getHealth(), vet.getStatusBite());
        System.out.println("В изоляторе находится: " + vet.animalInQuarantine[3]);
        System.out.println();
    }

    public static void checkStrelka(Squirrel strelka, Vet vet) {
        // Ветеринар проверяет белку Стрелку
        vet.setPersonPosition("Ветеринар");
        System.out.println(vet.getPersonPosition() + " начал осмотр белки Стрелки");
        vet.bitePerson();
        if (vet.getStatusBite() == true) {
            vet.bandage();
        }
        strelka.runAway();
        if (strelka.getStatusRun() == true) {
            vet.catchSquirrel();
        }
        vet.checkHealth("Стрелка", strelka.getHealth(), vet.getStatusBite());
        System.out.println("В карантине находится: " + vet.animalInQuarantine[4]);
        System.out.println();
    }

    private static void feedLeo(Cat leo, Zookeeper zookeeper, Vet vet) {
        // Смотритель кормит льва Кузю
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " кормит льва " + leo.getAnimalName());
        zookeeper.bitePerson();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        leo.setLeoIsFed();
        System.out.println("Лев " + leo.getAnimalName() + " покормлен " + leo.getLeoIsFed() + " раз(а)");
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " проверяет шерсть льва " + leo.getAnimalName());
        leo.outWool();
        zookeeper.bitePerson();
        zookeeper.getStatusBite();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        System.out.println();
    }

    private static void feedTiger(Cat tiger, Zookeeper zookeeper, Vet vet) {
        // Смотритель кормит тигра Жору
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " кормит тигра " + tiger.getAnimalName());
        zookeeper.bitePerson();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        tiger.setTigerIsFed();
        System.out.println("Тигр " + tiger.getAnimalName() + " покормлен " + tiger.getTigerIsFed() + " раз(а)");
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " проверяет шерсть тигра " + tiger.getAnimalName());
        tiger.outWool();
        zookeeper.bitePerson();
        zookeeper.getStatusBite();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        System.out.println();
    }

    private static void feedHippo(Hippo hippo, Zookeeper zookeeper, Vet vet) {
        // Смотритель кормит бегемота Досю
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " кормит бегемота " + hippo.getAnimalName());
        zookeeper.bitePerson();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        hippo.setHippoIsFed();
        System.out.println("Бегемот " + hippo.getAnimalName() + " покормлен " + hippo.getHippoIsFed() + " раз(а)");
        System.out.println();
    }

    private static void feedLovkach(Squirrel lovkach, Zookeeper zookeeper, Vet vet) {
        // Смотритель кормит белку Ловкач
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " кормит белку " + lovkach.getAnimalName());
        zookeeper.bitePerson();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        lovkach.setLovkachIsFed();
        System.out.println("Белка " + lovkach.getAnimalName() + " покормлен " + lovkach.getLovkachIsFed() + " раз(а)");
        System.out.println();
    }

    private static void feedStrelka(Squirrel strelka, Zookeeper zookeeper, Vet vet) {
        // Смотритель кормит белку Стрелку
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " кормит белку " + strelka.getAnimalName());
        zookeeper.bitePerson();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        strelka.runAway();
        if (strelka.getStatusRun() == true) {
            vet.catchSquirrel();
        }
        strelka.setStrelkaIsFed();
        System.out.println("Белка " + strelka.getAnimalName() + " покормлен " + strelka.getStrelkaIsFed() + " раз(а)");
        System.out.println();
    }

    private static void refresPool(Hippo hippo, Zookeeper zookeeper, Vet vet) {
        // Смотритель меняет воду у бегемота Доси
        zookeeper.setPersonPosition("Смотритель");
        System.out.println(zookeeper.getPersonPosition() + " меняет воду у бегемота " + hippo.getAnimalName());
        zookeeper.bitePerson();
        if (zookeeper.getStatusBite() == true) {
            vet.bandage();
        }
        zookeeper.setPersonPosition("Смотритель");
        System.out.print(zookeeper.getPersonPosition());
        hippo.changeWater();
        System.out.println("Вода у бегемота заменана " + hippo.getWater() + " раз(а)");
        System.out.println();
    }

    private static void showResults(Squirrel lovkach, Squirrel strelka, Cat leo, Cat tiger, Hippo hippo, Zookeeper zookeeper, Vet vet) {
        System.out.println("Конец рабочего дня");
        System.out.println("Итоги:");
        System.out.println("Лев " + leo.getAnimalName() + " был покормлен " + leo.getLeoIsFed() + " раза");
        System.out.println("Тигр " + tiger.getAnimalName() + " был покормлен " + tiger.getTigerIsFed() + " раза");
        System.out.println("Бегемот " + hippo.getAnimalName() + " был покормлен " + hippo.getHippoIsFed() + " раза");
        System.out.println("Белка " + lovkach.getAnimalName() + " был покормлен " + lovkach.getLovkachIsFed() + " раза");
        System.out.println("Белка " + strelka.getAnimalName() + " был покормлен " + strelka.getStrelkaIsFed() + " раза");

        System.out.println("Лев " + leo.getAnimalName() + " был расчесан " + leo.getShaggyCount() + " раза");
        System.out.println("Тигр " + tiger.getAnimalName() + " был расчесан " + tiger.getShaggyCount() + " раза");
        System.out.println("Белка " + strelka.getAnimalName() + " убежала " + leo.getLeoIsFed() + " раза");
        System.out.println("Бегемот " + hippo.getAnimalName() + " получил новую воду в бассейне " + leo.getLeoIsFed() + " раза");
        System.out.println(vet.getPersonPosition() + " был укушен " + vet.getBiteCount() + " раз");
        System.out.println(zookeeper.getPersonPosition() + " был укушен " + zookeeper.getBiteCount() + " раз");
        System.out.println(vet.getPersonPosition() + " выполнил " + vet.getBandageCount() + " повязок");
        return;
    }


}

        


