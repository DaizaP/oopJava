package com.example.oopjava.Seminar6.Homework.Task1.Model;

//Второй принцип. Имеется интерфейс (Model) и абстрактный класс(CalkModel), позволяющий расширять функциональность,
// не изменяя код в существующих классах.(Могу создать новый класс, для решения простого уравнения)
public abstract class CalcModel implements Model<Number> {
    Number x, y;

}
