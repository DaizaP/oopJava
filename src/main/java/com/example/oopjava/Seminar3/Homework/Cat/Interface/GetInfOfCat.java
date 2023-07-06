package com.example.oopjava.Seminar3.Homework.Cat.Interface;

public interface GetInfOfCat extends IConstCat {
    String getColorWoolCat(); // Цвет шерсти

    Integer getWeightCat(); //Вес

    String getColorEyesCat(); //Цвет глаз

    Integer getAgeCat(); //Возраст

    String getNameCat(); // Имя

    default void getFullInfoCat() {
        System.out.printf("""
                        Информация о котике:
                        Имя: %s
                        Возраст: %d
                        Вес: %d
                        Цвет глаз: %s
                        Цвет шерсти: %s
                        #####################\n""",
                getNameCat(), getAgeCat(), getWeightCat(), getColorEyesCat(), getColorWoolCat());
    }
}
