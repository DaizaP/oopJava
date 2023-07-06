package com.example.oopjava.Seminar3.Homework.Cat;


import com.example.oopjava.Seminar3.Homework.Cat.Interface.Cats;
import com.example.oopjava.Seminar3.Homework.Cat.Interface.Owners;

/**Создайте класс "Кот" (Cat) со следующими свойствами:

 Приватное поле "имя" (name) типа String для хранения имени кота.
 Приватное поле "возраст" (age) типа int для хранения возраста кота.
 Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
 Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу!
 Меня зовут <имя>. Мне <возраст> года(лет).".
 Дополнительное задание:
 Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
 Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
 Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу!
 Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".*/
public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Василий", 22, "Продавец", 45000, 100);
        Owner owner1 = new Owner("Николай");
        Owner owner2 = new Owner();
        Cat cat = new Cat("Мурка", 2, 6, "Синий");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.setOwner(owner1, cat1);
        cat1.setAgeCat(10);
        cat1.setColorEyesCat("Красный");
        cat1.greet();
        cat1.getFullInfoOwner();
        owner1.getFullInfoCat();
        owner.greet();
        owner.getFullInfoOwner();
        owner.getFullInfoCat();
        cat2.greet();
    }
}
