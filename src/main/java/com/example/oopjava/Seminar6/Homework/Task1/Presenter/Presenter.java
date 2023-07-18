package com.example.oopjava.Seminar6.Homework.Task1.Presenter;
import com.example.oopjava.Seminar6.Homework.Task1.Model.Model;
import com.example.oopjava.Seminar6.Homework.Task1.View.View;
// Выполняется пятый принцип т.к. и Presenter и классы из Model зависят от абстракции
public class Presenter {

    View view;
    Model<Number> model;

    public Presenter(Model<Number> m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
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
        // Конструкция if просто для красоты вывода знаков после запятой, абсолютно не влияет на функционал
        if (a.contains(".") || b.contains(".")) {
            model.setX(Double.parseDouble(a));
            model.setY(Double.parseDouble(b));
        } else {
            model.setX(Integer.valueOf(a));
            model.setY(Integer.valueOf(b));
        }
        //вычисление менял тут, для выполнения первого принципа(Убрал лишние методы, оставил один "универсальный")
        var result = model.res();
        view.print(result, model.expressionType());
    }
}