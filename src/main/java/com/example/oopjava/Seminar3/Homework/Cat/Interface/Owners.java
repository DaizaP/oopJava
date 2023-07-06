package com.example.oopjava.Seminar3.Homework.Cat.Interface;

import static java.lang.Math.*;

public abstract class Owners implements CharacteristicsOwner {

    protected Integer money;
    protected String job;
    protected String ownerName;
    protected Integer loveLevel;
    protected Integer ageOwner;

    public Owners(String ownerName, Integer ageOwner, String job, Integer money, Integer loveLevel){
        this.ownerName = ownerName;
        this.ageOwner = ageOwner;
        this.job = job;
        this.money = money;
        this.loveLevel = loveLevel;
    }
    public Owners(String ownerName, Integer ageOwner, String job, Integer money){
        this(ownerName,
                ageOwner,
                job,
                money,
                (int) (random() * 101));
    }
    public Owners(String ownerName, Integer ageOwner, String job){
        this(ownerName,
                ageOwner,
                job,
                MONEY,
                (int) (random() * 101));
    }
    public Owners(String ownerName, Integer ageOwner){
        this(ownerName,
                ageOwner,
                JOB,
                MONEY,
                (int) (random() * 101));
    }
    public Owners(String ownerName){
        this(ownerName,
                (int) (random() * 101),
                JOB,
                MONEY,
                (int) (random() * 101));
    }
    public Owners(){
        this("Ivan",
                (int) (random() * 101),
                JOB,
                MONEY,
                (int) (random() * 101));
    }

}
