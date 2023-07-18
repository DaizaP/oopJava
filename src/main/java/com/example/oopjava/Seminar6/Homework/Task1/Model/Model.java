package com.example.oopjava.Seminar6.Homework.Task1.Model;

public interface Model<T extends Number> {
    String RegExValidNum = "^[-+]?[0-9]*[.]?[0-9]+(?:[eE][-+]?[0-9]+)?$";

    String expressionType();
    T res();
    void setX(T value);

    void setY(T value);
}
