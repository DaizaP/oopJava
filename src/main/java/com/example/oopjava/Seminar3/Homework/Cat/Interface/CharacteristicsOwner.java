package com.example.oopjava.Seminar3.Homework.Cat.Interface;

public interface CharacteristicsOwner  extends GetInfOfOwner{
    void setValueOwner(Integer money); // Зарплата
    void setJobOwner(String job); // Работа
    void setOwnerName(String ownerName); // Имя
    void setLoveLevel(Integer level); // Уровень любви к котику в процентах

    void setAgeOwner(Integer age); // Возраст
}
