package com.kodilla;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        User rafal = new User("Rafal", 23);
        User kamil = new User("Kamil", 22);
        User alicja = new User("Alicja", 17);
        User marcin = new User("Marcin", 34);
        User ewelina = new User("Ewelina", 28);
        User krystyna = new User("Krystyna", 53);
        User wojciech = new User("Wojciech", 55);
        User mikolaj = new User("Mikolaj", 3);

        User[] users = {rafal, kamil, alicja, marcin, ewelina, krystyna, wojciech, mikolaj};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getAge();
        }

        int average = sum / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge()< average) {
                System.out.println(users[i].getName());
            }

        }


    }
}
