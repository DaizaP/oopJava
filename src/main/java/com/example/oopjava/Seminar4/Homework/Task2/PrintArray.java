package com.example.oopjava.Seminar4.Homework.Task2;


public class PrintArray {
    static <T> void printArray(T[] o) {
        for (var ob : o) {
            System.out.printf("%s ", ob);
        }
        System.out.println();
    }
}
