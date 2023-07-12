package com.example.oopjava.Seminar4.Homework.Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataContainer<T> {
    private final List<T> arr = new ArrayList<>();

    void add(T o) {
        this.arr.add(o);
    }

    T get(int o) {
        return this.arr.get(o);
    }

    void sort(Comparator<T> o) {
        this.arr.sort(o);
    }

    void print() {
        System.out.println(this.arr.toString());
    }
}
