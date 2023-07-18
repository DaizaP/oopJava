package com.example.oopjava.Seminar6.Homework.Task1.Model;
// Здесь применяем первый принцип. Был класс Calk в котором было 5 методов (sum, sub, div, mul),
// был разделен на 4 отдельных метода, выполняющие одну задачу
public class CalkSub extends CalcModel {
    public CalkSub() {
    }
    @Override
    public String expressionType() {
        return "Разница";
    }
    public Number res() {
        if (super.x instanceof Double || super.y instanceof Double) {
            return super.x.doubleValue() - super.y.doubleValue();
        } else {
            return super.x.intValue() - super.y.intValue();
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