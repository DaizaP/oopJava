package com.example.oopjava.Seminar2.Homework.Task2;

public class Human extends Actor{
    @Override
    String getName() {
        String[] Name = {"Андрей", "Егор", "Дмитрий"};
        return Name[(int) (Math.random() * 3)];
    }

    @Override
    public void setMakeOrder() {
        super.isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        super.isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
