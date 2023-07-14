package com.example.oopjava.Seminar5.Homework.Task1;

import com.example.oopjava.Seminar5.Homework.Task1.Model.Calk;
import com.example.oopjava.Seminar5.Homework.Task1.Presenter.Presenter;
import com.example.oopjava.Seminar5.Homework.Task1.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new Calk(), new View());
        p.buttonClickSub();
        p.buttonClickSum();
        p.buttonClickDiv();
        p.buttonClickMul();

    }
}
