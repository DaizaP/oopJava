package com.example.oopjava.Seminar5.Lesson5.Ex001Calc;

public class Calk extends CalcModel {
    public Calk() {
        
    }
    // do_it
    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}
