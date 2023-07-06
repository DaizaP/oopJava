package com.example.oopjava.Seminar3.Homework.Cat.Interface;

import static java.lang.Math.*;

public abstract class Cats implements CharacteristicsOfCats{
    private static Integer count;
    protected String catName;
    protected Integer ageCat;
    protected Integer catWeight;
    protected String colorEyes;
    protected String colorWool;
    static {
        count = 0;
    }
    public Cats(String catName, Integer ageCat, Integer catWeight, String colorEyes, String colorWool) {
        count++;
        String[] colorWool1 = {"Белый", "Черный", "Рыжий"};
        this.catName = catName;
        this.ageCat = ageCat;
        this.catWeight = catWeight;
        this.colorEyes = colorEyes;
        if(colorWool.equals("")){
            this.colorWool = colorWool1[(int) (random() * 3)];
        }else{
            this.colorWool = colorWool;
        }
    }
    public Cats(String catName, Integer ageCat, Integer catWeight, String colorEyes) {
        this(catName,
                ageCat,
                catWeight,
                colorEyes,
                "");

    }
    public Cats(String catName, Integer ageCat, Integer catWeight) {
        this(catName,
                ageCat,
                catWeight,
                "Зеленый",
                "");

    }
    public Cats(String catName, Integer ageCat) {
        this(catName,
                ageCat,
                (int) (random() * 20),
                "Зеленый",
                "");

    }
    public Cats(String catName) {
        this(catName,
                (int) (random() * 18),
                (int) (random() * 20),
                "Зеленый",
                "");

    }
    public Cats() {
        this("Мурзик%s".formatted(count),
                (int) (random() * 18),
                (int) (random() * 20),
                "Зеленый",
                "");
    }

}
