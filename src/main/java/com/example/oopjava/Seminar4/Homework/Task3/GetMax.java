package com.example.oopjava.Seminar4.Homework.Task3;

public class GetMax {
    static <T extends Comparable<T>> T getMax(T o1, T o2){
        return o1.compareTo(o2) > o2.compareTo(o1)? o1: o2;
    }
}