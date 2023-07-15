package com.example.oopjava.Seminar5.Homework.Task1.Model;

public interface Model<T extends Number> {
    String RegExValidNum = "^[-+]?[0-9]*[.]?[0-9]+(?:[eE][-+]?[0-9]+)?$";

    T sum();

    T sub();

    T div();

    T mul();

    void setX(T value);

    void setY(T value);
}
