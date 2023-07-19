package com.example.oopjava.Seminar7.Homework.Model;

// Здесь применяем первый принцип. Был класс Calk в котором было 5 методов (sum, sub, div, mul),
// был разделен на 4 отдельных метода, выполняющие одну задачу
public class CalkSub extends Complex {
    public CalkSub() {
    }
    @Override
    public String expressionType() {
        return "Разница";
    }

    @Override
    public String res() {
        if (getImage() - getImage2() == 0) {
            return Double.toString(getReal() - getReal2());
        } else if (getImage() - getImage2() < 0) {
            return Double.toString(getReal() - getReal2()) + " " +
                   Double.toString(getImage() - getImage2()) + "i";
        } else {
            return Double.toString(getReal() - getReal2()) + " + " +
                   Double.toString(getImage() - getImage2()) + "i";
        }
    }

}
