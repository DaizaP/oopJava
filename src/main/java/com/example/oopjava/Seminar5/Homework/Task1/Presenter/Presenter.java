package com.example.oopjava.Seminar5.Homework.Task1.Presenter;

import com.example.oopjava.Seminar5.Homework.Task1.Model.Model;
import com.example.oopjava.Seminar5.Homework.Task1.View.View;

public class Presenter {

    View view;
    Model<Number> model;

    public Presenter(Model<Number> m, View v) {
        this.model = m;
        this.view = v;
    }

    private void buttonClick() {
        String a = view.getValue("a: ");
        String b = view.getValue("b: ");
        //RegEx валидация пытался сам составить, но долго допирал,
        // посмотрел в инете продвинутую форму, на проверку дробного или целого числа
        while (!a.matches(this.model.RegExValidNum) ||
               !b.matches(this.model.RegExValidNum)) {
            this.view.notification1.incorrectNumber();
            a = view.getValue("a: ");
            b = view.getValue("b: ");
        }


        if (a.contains(".") || b.contains(".")) {
            model.setX(Double.parseDouble(a));
            model.setY(Double.parseDouble(b));
        } else {
            model.setX(Integer.valueOf(a));
            model.setY(Integer.valueOf(b));
        }

    }

    public void buttonClickSum() {
        buttonClick();
        var result = model.sum();
        view.print(result, "Сумма: ");
    }

    public void buttonClickDiv() {
        buttonClick();

        var result = model.div();
        view.print(result, "Деление: ");
    }

    public void buttonClickSub() {
        buttonClick();
        var result = model.sub();
        view.print(result, "Разница: ");
    }

    public void buttonClickMul() {
        buttonClick();
        var result = model.mul();
        view.print(result, "Умножение: ");
    }
}