package com.example.oopjava.Seminar6.Homework.Task2.View;

/**
 * То где лежат всякие уведомления для пользователя
 */
public class Notification {
    public void incorrectPassAndLogin(){
        System.out.println("Неверный логин или пароль");
    }
    public void gate(){
        System.out.println("Вы вошли");
    }
    public void alreadyLoggedIn() {
        System.out.println("Вы уже вошли.");
    }

    public void NotLoggedInYet() {
        System.out.println("Вы не вошли в систему:");
    }

    public void setPass() {
        System.out.println("Готово. Необходимо войти заново.");
    }
}
