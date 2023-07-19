package com.example.oopjava.Seminar7.Homework;

import com.example.oopjava.Seminar7.Homework.Model.CalkDiv;
import com.example.oopjava.Seminar7.Homework.Model.CalkMul;
import com.example.oopjava.Seminar7.Homework.Model.CalkSub;
import com.example.oopjava.Seminar7.Homework.Model.CalkSum;
import com.example.oopjava.Seminar7.Homework.Presenter.Presenter;
import com.example.oopjava.Seminar7.Homework.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter sum = new Presenter(new CalkSum(), new View());
        sum.buttonClick();
        Presenter sub = new Presenter(new CalkSub(), new View());
        sub.buttonClick();
        Presenter mul = new Presenter(new CalkMul(), new View());
        mul.buttonClick();
        Presenter div = new Presenter(new CalkDiv(), new View());
        div.buttonClick();
    }
}