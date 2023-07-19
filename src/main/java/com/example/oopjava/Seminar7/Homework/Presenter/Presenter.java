package com.example.oopjava.Seminar7.Homework.Presenter;

import com.example.oopjava.Seminar7.Homework.Model.Model;
import com.example.oopjava.Seminar7.Homework.View.View;

public class Presenter {

    View view;
    Model model;

    public Presenter(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        String a = this.view.getValue("first_a: ");
        String bi = this.view.getValue("first_bi: ");
        String a1 = this.view.getValue("second_a2: ");
        String bi1 = this.view.getValue("second_bi2: ");
        while (!a.matches(this.model.RegExValidNumReal) ||
               !bi.matches(this.model.RegExValidNumImage) ||
               !a1.matches(this.model.RegExValidNumReal) ||
               !bi1.matches(this.model.RegExValidNumImage)) {
            this.view.notification1.incorrectNumber();
            a = this.view.getValue("first_a: ");
            bi = this.view.getValue("first_bi: ");
            a1 = this.view.getValue("second_a2: ");
            bi1 = this.view.getValue("second_bi2: ");
        }
        this.model.real(a);
        this.model.image(bi);
        this.model.real2(a1);
        this.model.image2(bi1);

        String result = this.model.res();
        view.logger.printLog(String.format("""
                Первое число: (%s + %s)
                Второе число: (%s + %s)
                Операция: %s
                Результат: %s
                _______________________""", a, bi, a1,bi1, this.model.expressionType(), result));
        this.view.print(result, this.model.expressionType());
    }
}