package com.example.oopjava.Seminar1.Homework.Task1;

public class Main {
    public static void main(String[] args) {
        Cat whiteCat = new Cat();
        Cat blackCat = new Cat("Space", 4);
        blackCat.setName("Вася");
        whiteCat.setOwnerName("Vasya");
        whiteCat.greet();
        blackCat.greet();
    }
}
