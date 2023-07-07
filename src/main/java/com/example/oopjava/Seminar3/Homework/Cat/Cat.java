package com.example.oopjava.Seminar3.Homework.Cat;

import com.example.oopjava.Seminar3.Homework.Cat.Interface.Cats;
import com.example.oopjava.Seminar3.Homework.Cat.Interface.HW3Interface.Valid;
import com.example.oopjava.Seminar3.Homework.Cat.Interface.Owners;

public class Cat extends Cats {
    private Valid valid = (n) -> n != null;
    private Owner owner = null;

    //Воть тут использовал функциональный интерфейс Valid
    public void greet() {
        if (valid.test(owner)) {
            System.out.format("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n",
                    this.catName, this.ageCat, this.owner.getOwnerName());
        } else {
            System.out.format("Мяу! Меня зовут %s. Мне %d года(лет). У меня нет человека :(\n",
                    this.catName, this.ageCat);
        }
    }
    //Воть тут использовал функциональный интерфейс Valid
    public void getFullInfoOwner(){
        if(valid.test(owner)) {
            owner.getFullInfoOwner();
        }else{
            System.out.format("У котика %s владельца нет :(\n", this.catName);
        }
    }
    public Cat(String catName, Integer ageCat, Integer catWeight, String colorEyes) {
        super(catName, ageCat, catWeight, colorEyes);
    }
    public Cat(String catName, Integer ageCat, Integer catWeight) {
        super(catName, ageCat, catWeight);
    }
    public Cat(String catName, Integer ageCat) {
        super(catName, ageCat);
    }
    public Cat(String catName) {
        super(catName);
    }
    public Cat() {
        super();
    }
    //Очень легко переполнить им память, если убрать логическое условие
    public void setOwner(Owner owner1, Cat cat1) {
        if ( this.owner == null || (this.owner != owner1 || owner.getCat() != cat1)) {
            this.owner = owner1;
            owner.setCat(cat1, this.owner);
        }
    }

    public Owners getOwner() {
        return owner;
    }

    @Override
    public void setColorWoolCat(String colorWool) {
        this.colorWool = colorWool;
    }

    @Override
    public void setWeightCat(Integer weight) {
        this.catWeight = weight;
    }

    @Override
    public void setColorEyesCat(String colorEyes) {
        this.colorEyes = colorEyes;
    }

    @Override
    public void setAgeCat(Integer age) {
        this.ageCat = age;
    }

    @Override
    public void setNameCat(String name) {
        this.catName = name;
    }

    @Override
    public String getColorWoolCat() {
        return colorWool;
    }

    @Override
    public Integer getWeightCat() {
        return catWeight;
    }

    @Override
    public String getColorEyesCat() {
        return colorEyes;
    }

    @Override
    public Integer getAgeCat() {
        return ageCat;
    }

    @Override
    public String getNameCat() {
        return catName;
    }
}
