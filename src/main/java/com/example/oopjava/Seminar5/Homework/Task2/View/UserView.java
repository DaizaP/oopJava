package com.example.oopjava.Seminar5.Homework.Task2.View;

import java.util.Scanner;

public class UserView {

    //Не делал наследование т.к. хотел, чтобы в presenter было видно где я просто уведомление вызываю,
    // а где методы для отображения полей взаимодействия
    public Notification notification = new Notification();
    Scanner in = new Scanner(System.in);

    /**
     * Метод для регистрации
     * @return Массив с указанным логином и паролем
     */
    public String[] req() {
        System.out.println("Для регистрации заполните логин и пароль.\n" +
                           "После подтверждения ввода логина и пароля вы соглашаетесь на обработку себя :) ");
        return new String[]{textScan("Логин: "), textScan("Пароль: ")};
    }

    /**
     * Метод для входа
     * @return Массив с указанным логином и паролем
     */
    public String[] gate() {
        System.out.println("Вход: ");
        return new String[]{textScan("Логин: "), textScan("Пароль: ")};
    }

    /**
     * Метод для изменения логина или пароля
     * @return Массив с указанным логином и паролем
     */
    public String[] editPassAndLogin() {
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

    /**
     * Редактирование информации о пользователе
     * @return Информация о пользователе
     */
    public String editInfo() {
        return textScan("Введите информацию: ");
    }

    /**
     * Получение информации о пользователе
     * @param str Информация о пользователе
     */
    public void getInfo(String str) {
        System.out.println("Информация о пользователе:\n" + str);
    }

    /**
     * Сканирование слова, не фразы
     * @param title Текст, которым вы даете понять, что хотите от пользователя
     * @return слово, которое ввел пользователь до пробела
     */
    //Стараемся исключать повторения, поэтому скан строки пихнул в отдельный метод
    private String textScan(String title) {
        System.out.printf("%s", title);
        return in.next();
    }
}
