package com.kodilla.abstracts.homework;

public class Action {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(3500, "Teaches students");
        Person adam = new Person("Adam",26, teacher);

        Job programmer = new Programmer(7000, "Coding");
        Person jan = new Person("Jan",32, programmer);
    }
}

