package newzoo.animal;

import java.util.Random;

public class Cat extends Animal{

    private int shaggyCount = 0; // счетчик расчёсывания
    private boolean needOutWool; // необходимость расчесывания
    private int leoIsFed = 0; // счетчик кормления льва
    private int tigerIsFed = 0; // счетчик кормления тигра

    // конструктор
    public Cat(String name) {
        super (name);
    }

    // метод вычесывания
    public boolean outWool() {
        boolean shaggy = new Random().nextBoolean();
        if (shaggy == true) {
            System.out.println("Животное необходимо расчесать");
            this.needOutWool = false;
            shaggyCount++;
        } else {
            System.out.println("Животное не нужно расчесывать");
        }
        return needOutWool;
    }

    // геттер статуса вычесывания
    public boolean getStatusWool(boolean wool) {
        var needToWool = new Random().nextBoolean();
        return needToWool;
    }

    // геттер количества вычесанных кошек
    public int getShaggyCount() {
        return shaggyCount;
    }

    // геттер/сеттер количества кормлений льва
    public int getLeoIsFed() {
        //System.out.println(getAnimalName());
        return leoIsFed;
    }
    public void setLeoIsFed() {
        leoIsFed++;
    }

    // геттер/сеттер количества кормлений тигра
    public int getTigerIsFed() {
        return tigerIsFed;
    }
    public void setTigerIsFed() {
        tigerIsFed++;
    }
}
