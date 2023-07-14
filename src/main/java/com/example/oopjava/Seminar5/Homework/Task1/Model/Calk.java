package com.example.oopjava.Seminar5.Homework.Task1.Model;

public class Calk extends CalcModel {
    public Calk() {

    }
    @Override
    public Number sum() {
        if(x instanceof Double || y instanceof Double)
        {
            return x.doubleValue() + y.doubleValue();
        }
        else
        {
            return x.intValue() + y.intValue();
        }
    }

    @Override
    public Number sub() {
        if(x instanceof Double || y instanceof Double)
        {
            return x.doubleValue() - y.doubleValue();
        }
        else
        {
            return x.intValue() - y.intValue();
        }
    }

    @Override
    public Number div() {
        if(x instanceof Double || y instanceof Double)
        {
            return x.doubleValue() / y.doubleValue();
        }
        else
        {
            return x.intValue() / y.intValue();
        }
    }

    @Override
    public Number mul() {
        if(x instanceof Double || y instanceof Double)
        {
            return x.doubleValue() * y.doubleValue();
        }
        else
        {
            return x.intValue() * y.intValue();
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
