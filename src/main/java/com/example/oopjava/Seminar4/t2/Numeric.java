package com.example.oopjava.Seminar4.t2;

public class Numeric<T extends Number> {
    T num;

    Numeric(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
}
