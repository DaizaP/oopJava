package com.example.oopjava.Seminar6.Homework.Task1;

import com.example.oopjava.Seminar6.Homework.Task1.Model.CalkDiv;
import com.example.oopjava.Seminar6.Homework.Task1.Model.CalkMul;
import com.example.oopjava.Seminar6.Homework.Task1.Model.CalkSub;
import com.example.oopjava.Seminar6.Homework.Task1.Model.CalkSum;
import com.example.oopjava.Seminar6.Homework.Task1.Presenter.Presenter;
import com.example.oopjava.Seminar6.Homework.Task1.View.View;
// Первый принцип выполняется. Был класс Calk в котором было 4 методов, был разделен на 4 отдельных класса.
// Второй принцип. Имеется (Model) и абстрактный класс(CalkModel), позволяющий расширять функциональность,
// не изменяя код в существующих классах.(Могу создать новый класс, для решения простого уравнения)
// Третий принцип не реализовать т.к. нет родительских классов(кроме абстрактного, он вроде как, не считается).
// Четвертый принцип выполняется. Нет классов, которые реализуют ненужные методы интерфейса.
// Выполняется пятый принцип т.к. и Presenter(верхний уровень) и классы из Model(нижний уровень) зависят от абстракции
public class Program {
    public static void main(String[] args) {
        Presenter sub = new Presenter(new CalkSub(), new View());
        sub.buttonClick();
        Presenter div = new Presenter(new CalkDiv(), new View());
        div.buttonClick();
        Presenter mul = new Presenter(new CalkMul(), new View());
        mul.buttonClick();
        Presenter sum = new Presenter(new CalkSum(), new View());
        sum.buttonClick();

    }
}
