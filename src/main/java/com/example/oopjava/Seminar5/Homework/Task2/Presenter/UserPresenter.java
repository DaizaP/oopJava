package com.example.oopjava.Seminar5.Homework.Task2.Presenter;

import com.example.oopjava.Seminar5.Homework.Task2.Model.User;
import com.example.oopjava.Seminar5.Homework.Task2.View.UserView;

public class UserPresenter {
    private boolean bGate = false;
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
            String[] reqInfo = userView.req();
            this.user.setLogin(reqInfo[0]);
            this.user.setPass(reqInfo[1]);
        }
    }

    public void gate() {
        if (bGate) {
            userView.notification.alreadyLoggedIn();
        } else {
            String[] gateInfo = this.userView.gate();
            while (!(this.user.getLogin().equals(gateInfo[0]) && user.getPass().equals(gateInfo[1]))) {
                userView.notification.incorrectPassAndLogin();
                gateInfo = this.userView.gate();
            }
            userView.notification.gate();
            bGate = true;
        }
    }
    public void getInfo(){
        if (bGate) {
            userView.getInfo(user.getInfo());
        }else {
            userView.notification.NotLoggedInYet();
        }
    }
    public void setInfo() {
        if (bGate) {
            this.user.setInfo(this.userView.editInfo());
        }else {
            userView.notification.NotLoggedInYet();
        }
    }

    public void setPassAndLogin() {
        String[] str = this.userView.editPassAndLogin();
        if (bGate) {
            this.user.setLogin(str[0]);
            this.user.setPass(str[1]);
            bGate = false;
            userView.notification.setPass();
        }else {
            userView.notification.NotLoggedInYet();
        }
    }

}
