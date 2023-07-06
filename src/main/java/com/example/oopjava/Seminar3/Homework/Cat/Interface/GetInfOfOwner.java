package com.example.oopjava.Seminar3.Homework.Cat.Interface;

public interface GetInfOfOwner extends IConstOwner {
    Integer getValueOwner(); // Зарплата

    String getJobOwner(); // Работа

    String getOwnerName(); // Имя

    Integer getLoveLevel(); // Уровень любви к котику в процентах

    Integer getAgeOwner(); // Возраст

    default void getFullInfoOwner() {
        System.out.printf("""
                        Информация о владельце:
                        Имя: %s
                        Возраст: %d
                        Работа: %s
                        Уровень зарплаты: %d
                        Любовь к котику: %s процентов.
                        #######################\n""",
                getOwnerName(), getAgeOwner(), getJobOwner(), getValueOwner(), getLoveLevel());
    }

}
