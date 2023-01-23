package pet;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        System.out.println("Введите имя питомца: ");
        String catName = (new Scanner(System.in)).nextLine();

        Cat kitty = new Cat();
        kitty.name = catName;

        System.out.println(kitty.getName());
        kitty.drinkMilk();
    }
}

