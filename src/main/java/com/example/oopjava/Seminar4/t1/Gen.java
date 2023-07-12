package com.example.oopjava.Seminar4.t1;

public class Gen <T, V>{
    T ob;
    V ob2;
    Gen(T o, V o2){
        ob = o;
        ob2 = o2;
    }

    public T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    void showType(){
        System.out.println("Тип T это: " + ob.getClass().getName());
        System.out.println("Тип V это: " + ob2.getClass().getName());
    }
}
