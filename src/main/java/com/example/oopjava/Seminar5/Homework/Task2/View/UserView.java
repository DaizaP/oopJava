package com.example.oopjava.Seminar5.Homework.Task2.View;

import java.util.Scanner;

public class UserView {
    Scanner in = new Scanner(System.in);

    //рега
    public String[] req() {
        System.out.println("Для регистрации заполните логин и пароль.\n" +
                           "После подтверждения ввода логина и пароля вы соглашаетесь на обработку себя :) ");
        return new String[]{textScan("Логин: "), textScan("Пароль: ")};
    }

    //Вход
    public String[] gate() {
        System.out.println("Вход: ");
        return new String[]{textScan("Логин: "), textScan("Пароль: ")};
    }

    public String[] edit() {
        String[] str = new String[2];
        System.out.println("Введите желаемый логин и два раза новый пароль: ");
        str[0] = textScan("Логин: ");
        str[1] = textScan("Пароль: ");
        while (!str[1].equals(textScan("Повторите пароль: "))) {
            System.out.println("Пароли не совпадают. Повторите ввод.");
            str[1] = textScan("Пароль: ");
        }
        return str;
    }

    public String editInfo() {
        return textScan("Введите информацию: ");
    }
    public void getInfo(String str){
        System.out.println("Информация о пользователе:\n" + str);
    }

    //Стараемя исключать повторения, поэтому скан строки пихнул в отдельный метод
    private String textScan(String title) {
        System.out.printf("%s", title);
        return in.next();
    }
}
