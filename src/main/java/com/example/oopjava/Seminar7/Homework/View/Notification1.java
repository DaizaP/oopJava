package com.example.oopjava.Seminar7.Homework.View;

public class Notification1 {
    public void incorrectNumber() {
        System.out.println("Принимаются только комплексные числа(a + bi)");
    }

    public void exception(Exception e) {
        System.out.println("Ошибка: " + e.getMessage());
    }
}
