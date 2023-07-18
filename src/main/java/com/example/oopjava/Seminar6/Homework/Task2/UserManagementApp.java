package com.example.oopjava.Seminar6.Homework.Task2;

import com.example.oopjava.Seminar6.Homework.Task2.Model.User;
import com.example.oopjava.Seminar6.Homework.Task2.Presenter.UserPresenter;
import com.example.oopjava.Seminar6.Homework.Task2.View.UserView;

public class UserManagementApp {
    public static void main(String[] args) {
        UserPresenter p = new UserPresenter(new User(), new UserView());
        p.setInfo();
        p.getInfo();
        p.req();
        p.gate();
        p.setInfo();
        p.getInfo();
        p.setPassAndLogin();
        p.setInfo();
        p.getInfo();
        p.gate();
    }
}
