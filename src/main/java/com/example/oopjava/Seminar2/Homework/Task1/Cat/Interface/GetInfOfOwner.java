package com.example.oopjava.Seminar2.Homework.Task1.Cat.Interface;

public interface GetInfOfOwner {
    default String getOwnerName(){
        String[] ownerName = {"Андрей", "Егор", "Дмитрий"};
            return ownerName[(int) (Math.random() * 3)];
    }
    Integer getValue();
    String getJob();


}
