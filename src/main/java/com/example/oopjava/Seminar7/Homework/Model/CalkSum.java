package com.example.oopjava.Seminar7.Homework.Model;

public class CalkSum extends Complex {

    public CalkSum() {
    }

    @Override
    public String expressionType() {
        return "Сумма";
    }

    @Override
    public String res() {
        if (getImage() + getImage2() == 0) {
            return Double.toString(getReal() + getReal2());
        } else if (getImage() + getImage2() < 0) {
            return Double.toString(getReal() + getReal2()) +
                   Double.toString(getImage() + getImage2()) + "i";
        } else {
            return Double.toString(getReal() + getReal2()) + " + " +
                   Double.toString(getImage() + getImage2()) + "i";
        }
    }
}
