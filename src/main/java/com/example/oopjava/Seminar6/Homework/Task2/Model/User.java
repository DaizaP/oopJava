package com.example.oopjava.Seminar6.Homework.Task2.Model;

public class User {
    private String login;
    private String pass;
    private String info = "";
    private boolean bGate = false;

    public User() {

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setBoolGate(boolean bGate) {
        this.bGate = bGate;
    }

    public boolean isBoolGate() {
        return bGate;
    }
}
