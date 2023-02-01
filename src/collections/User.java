package collections;

import java.util.ArrayList;

class User {
    private int id;
    private String name;
    private int age;
    private ArrayList<String> phoneNumbers;

    public User(int id, String name, int age, ArrayList<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
