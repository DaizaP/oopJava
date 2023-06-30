package com.example.oopjava.Seminar1.Homework.Task2;
/**Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
 * Класс должен обладать следующими методами:
 Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
 Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
 Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
 Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
 Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).*/
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,11);
        System.out.format("r1 Area:  %d | Perimeter: %d.\n", r1.calculateArea(),r1.calculatePerimeter());
        System.out.format("r2 Area: %d | Perimeter: %d.\n", r2.calculateArea(),r2.calculatePerimeter());
    }
}
