package com.example.oopjava.Seminar4.Homework.Task4;


public class Main {
    public static void main(String[] args) {
        DataContainer<String> stringDataContainer = new DataContainer<>();
        stringDataContainer.add("аддон");
        stringDataContainer.add("время");
        stringDataContainer.add("граница");
        stringDataContainer.add("чепуха");
        stringDataContainer.add("язь");
        stringDataContainer.print();
        stringDataContainer.sort(String::lastIndexOf);
        stringDataContainer.print();
    }
}
