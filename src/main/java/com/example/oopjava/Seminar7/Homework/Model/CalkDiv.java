package com.example.oopjava.Seminar7.Homework.Model;

// Здесь применяем первый принцип. Был класс Calk в котором было 5 методов (sum, sub, div, mul),
// был разделен на 4 отдельных метода
public class CalkDiv extends Complex {
    public CalkDiv() {
    }

    @Override
    public String expressionType() {
        return "Деление";
    }

    @Override
    public String res() {
        if ((getImage() * getReal2() - getReal() * getImage2()) /
            (getReal2() * getReal2() + getImage2() * getImage2()) == 0) {
            return Double.toString((getReal() * getReal2() + getImage() * getImage2()) /
                                   (getReal2() * getReal2() + getImage2() * getImage2()));
        } else if (getImage() * getReal2() + getReal() * getImage2() < 0) {
            return Double.toString((getReal() * getReal2() + getImage() * getImage2()) /
                                   (getReal2() * getReal2() + getImage2() * getImage2())) +
                   Double.toString((getImage() * getReal2() - getReal() * getImage2()) /
                                   (getReal2() * getReal2() + getImage2() * getImage2())) + "i";
        } else {
            return Double.toString((getReal() * getReal2() + getImage() * getImage2()) /
                                   (getReal2() * getReal2() + getImage2() * getImage2())) + " + " +
                   Double.toString((getImage() * getReal2() - getReal() * getImage2()) /
                                   (getReal2() * getReal2() + getImage2() * getImage2())) + "i";
        }
    }
}
