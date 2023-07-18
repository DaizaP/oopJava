package com.example.oopjava.Seminar6.Homework.Task1.Model;
// Здесь применяем первый принцип. Был класс Calk в котором было 5 методов (sum, sub, div, mul),
// был разделен на 4 отдельных метода
public class CalkDiv extends CalcModel {
    public CalkDiv() {
    }
    @Override
    public String expressionType() {
        return "Деление";
    }
    public Number res() {
        if (super.x instanceof Double || super.y instanceof Double) {
            return super.x.doubleValue() / super.y.doubleValue();
        } else {
            return super.x.intValue() / super.y.intValue();
        }
    }

    @Override
    public void setX(Number value) {
        super.x = value;
    }

    @Override
    public void setY(Number value) {
        super.y = value;
    }
}
