package com.example.oopjava.Seminar1.Homework.Task1;
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
        Cat whiteCat = new Cat();
        Cat blackCat = new Cat("Space", 4);
        blackCat.setName("Вася");
        whiteCat.setOwnerName("Vasya");
        whiteCat.greet();
        blackCat.greet();
    }
}
