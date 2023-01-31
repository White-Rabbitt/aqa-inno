package newzoo.person;

import java.util.Random;

public class Vet extends Person {

    private boolean isIll;

    public String[] animalInQuarantine = new String[5];

    public Vet(String position) {
        super (position);
    }

    // метод осмотра животного
    public boolean checkHealth(String name, boolean health, boolean bite) {
        var chanceToIll = new Random().nextInt(0, 100);
        if (chanceToIll > 15) {
            this.isIll = true;
            animalInQuarantine[0] = name;
            System.out.println("Вероятность болезни животного: " + chanceToIll + "%");
            System.out.println("Животное больно и помещено в изолятор");

        } else {
            this.isIll = false;
            System.out.println("Вероятность болезни: " + chanceToIll + "%");
            System.out.println("Животное здорово осталось в вольере");
        }
        return isIll;
    }


}
