package com.example.oopjava.Seminar3.Homework.Cat;


import com.example.oopjava.Seminar3.Homework.Cat.Interface.Cats;
import com.example.oopjava.Seminar3.Homework.Cat.Interface.HW3Interface.IterCat;
import com.example.oopjava.Seminar3.Homework.Cat.Interface.Owners;

import java.util.ArrayList;

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
        //Оставил только методы для проверки реализации последнего домашнего задания
        ArrayList<Cats> catsArrayList = new ArrayList<>();
        IterCat iterCat = new IterCat(catsArrayList);
        Owner owner = new Owner();
        Cat cat = new Cat("Мурка", 2, 6, "Синий");
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        catsArrayList.add(cat);
        catsArrayList.add(cat1);
        catsArrayList.add(cat2);
        catsArrayList.add(cat3);
        catsArrayList.add(cat4);
        for (Cats z: iterCat) {
            z.getFullInfoCat();
        }
        // Проверка функционального интерфейса Valid
        cat.setOwner(owner, cat);
        //Выведет инфу
        cat.getFullInfoOwner();
        //Не выведет
        cat2.getFullInfoOwner();


    }
}
