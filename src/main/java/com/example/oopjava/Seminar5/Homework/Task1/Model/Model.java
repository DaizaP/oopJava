package com.example.oopjava.Seminar5.Homework.Task1.Model;

public interface Model<T extends Number> {
    T sum();
    T sub();
    T div();
    T mul();

    void setX(T value);

    void setY(T value);
}
