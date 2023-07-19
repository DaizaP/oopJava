package com.example.oopjava.Seminar7.Homework.Model;

// Здесь применяем первый принцип. Был класс Calk в котором было 5 методов (sum, sub, div, mul),
// был разделен на 4 отдельных метода
public class CalkMul extends Complex {
    public CalkMul() {
    }

    @Override
    public String expressionType() {
        return "Умножение";
    }

    @Override
    public String res() {
        if (getImage() * getReal2() + getReal() * getImage2() == 0) {
            return Double.toString(getReal() * getReal2() - getImage() * getImage2());
        } else if (getImage() * getReal2() + getReal() * getImage2() < 0) {
            return Double.toString(getReal() * getReal2() - getImage() * getImage2()) +
                   Double.toString(getImage() * getReal2() + getReal() * getImage2()) + "i";
        } else {
            return Double.toString(getReal() * getReal2() - getImage() * getImage2()) + " + " +
                   Double.toString(getImage() * getReal2() + getReal() * getImage2()) + "i";
        }
    }
}
