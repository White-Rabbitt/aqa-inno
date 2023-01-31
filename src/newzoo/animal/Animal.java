package newzoo.animal;

import java.util.Random;

public class Animal {

    private String animalName;
    private boolean isIll = false;


    private int lovkachIsFed = 0;
    private int strelkaIsFed = 0;




    // конструктор
    public Animal(String name) {
        animalName = name;
    }

    // геттер для получени имени
    public String getAnimalName() {
        return animalName;
    }

    // геттер для получения статуса здоровья
    public boolean getHealth() {
        return isIll;
    }






    // геттер/сеттер количества кормлений белки Ловкач
    public int getLovkachIsFed() {
        return lovkachIsFed;
    }
    public void setLovkachIsFed() {
        lovkachIsFed++;
    }

    // геттер/сеттер количества кормлений белки Стрелки
    public int getStrelkaIsFed() {
        return strelkaIsFed;
    }
    public void setStrelkaIsFed() {
        strelkaIsFed++;
    }
}
