package com.example.oopjava.Seminar6.Homework.Task2.Presenter;

import com.example.oopjava.Seminar6.Homework.Task2.Model.User;
import com.example.oopjava.Seminar6.Homework.Task2.View.UserView;

public class UserPresenter {
    User user;
    UserView userView;

    public UserPresenter(User user, UserView userView) {
        this.user = user;
        this.userView = userView;
    }

    public void req() {
        if (this.user.getLogin() != null) {
            System.out.println(" Вы зарегистрированы. Направляю на вход.");
            gate();
        } else {
            String[] reqInfo = this.userView.req();
            this.user.setLogin(reqInfo[0]);
            this.user.setPass(reqInfo[1]);
        }
    }

    public void gate() {
        //Проверка, что пользователь вошел в систему
        if (this.user.isBoolGate()) {
            this.userView.notification.alreadyLoggedIn();
        } else {
            String[] gateInfo = this.userView.gate();
            while (!(this.user.getLogin().equals(gateInfo[0]) && this.user.getPass().equals(gateInfo[1]))) {
                this.userView.notification.incorrectPassAndLogin();
                gateInfo = this.userView.gate();
            }
            this.userView.notification.gate();
            this.user.setBoolGate(true);
        }
    }

    public void getInfo() {
        if (this.user.isBoolGate()) {
            this.userView.getInfo(this.user.getInfo());
        } else {
            this.userView.notification.NotLoggedInYet();
        }
    }

    public void setInfo() {
        if (this.user.isBoolGate()) {
            this.user.setInfo(this.userView.editInfo());
        } else {
            this.userView.notification.NotLoggedInYet();
        }
    }

    public void setPassAndLogin() {
        String[] str = this.userView.editPassAndLogin();
        if (this.user.isBoolGate()) {
            this.user.setLogin(str[0]);
            this.user.setPass(str[1]);
            this.user.setBoolGate(false);
            this.userView.notification.setPass();
        } else {
            this.userView.notification.NotLoggedInYet();
        }
    }

}
