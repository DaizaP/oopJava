package com.example.oopjava.Seminar3.Homework.Cat;

import com.example.oopjava.Seminar3.Homework.Cat.Interface.Cats;
import com.example.oopjava.Seminar3.Homework.Cat.Interface.Owners;

public class Owner extends Owners {

    private Cat cat = null;
    private boolean count = false;

    public void greet() {
        if (cat != null) {
            System.out.format("Привет! Меня зовут %s. Мне %d года(лет). Мой котик - %s.\n",
                    this.ownerName, this.ageOwner, this.cat.getNameCat());
        } else {
            System.out.format("Мяу! Меня зовут %s. Мне %d года(лет). У меня нет котика :(\n",
                    this.ownerName, this.ageOwner);
        }
    }

    public void getFullInfoCat() {
        if (cat != null) {
            cat.getFullInfoCat();
        } else {
            System.out.format("У %s нет котика нет :(\n", this.ownerName);
        }
    }

    public Owner(String ownerName, Integer ageOwner, String job, Integer money, Integer loveLevel) {
        super(ownerName, ageOwner, job, money, loveLevel);
    }

    public Owner(String ownerName, Integer ageOwner, String job, Integer money) {
        super(ownerName, ageOwner, job, money);
    }

    public Owner(String ownerName, Integer ageOwner, String job) {
        super(ownerName, ageOwner, job);
    }

    public Owner(String ownerName, Integer ageOwner) {
        super(ownerName, ageOwner);
    }

    public Owner(String ownerName) {
        super(ownerName);
    }

    public Owner() {
        super();
    }

    //Очень легко переполнить им память, если убрать логическое условие
    void setCat(Cat cat1, Owner owner1) {
        if ( this.cat == null || (this.cat != cat1 || cat.getOwner() != owner1)) {
            this.cat = cat1;
            cat.setOwner(owner1, this.cat);}
    }

    public Cats getCat() {
        return cat;
    }

    @Override
    public void setValueOwner(Integer money) {
        this.money = money;
    }

    @Override
    public void setJobOwner(String job) {
        this.job = job;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void setLoveLevel(Integer level) {
        this.loveLevel = level;
    }

    @Override
    public void setAgeOwner(Integer age) {
        this.ageOwner = age;
    }

    @Override
    public Integer getValueOwner() {
        return money;
    }

    @Override
    public String getJobOwner() {
        return job;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public Integer getLoveLevel() {
        return loveLevel;
    }

    @Override
    public Integer getAgeOwner() {
        return ageOwner;
    }
}
