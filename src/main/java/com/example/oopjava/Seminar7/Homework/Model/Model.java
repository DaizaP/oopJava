package com.example.oopjava.Seminar7.Homework.Model;

public interface Model {
    String RegExValidNumReal = "^[-+]?[0-9]*[.]?[0-9]+(?:[eE][-+]?[0-9]+)?$";
    String RegExValidNumImage = "^[-+]?[0-9]*[.]?[0-9]+[i](?:[eE][-+]?[0-9]+[i])?$";
    String expressionType();
    String res();
    void real(String value);
    void real2(String value);
    void image(String value);
    void image2(String value);
}
