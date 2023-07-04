package com.example.oopjava.Seminar2.Homework.Task1.Cat;

import com.example.oopjava.Seminar2.Homework.Task1.Cat.Interface.TypeOfOwner;

public class Owner implements TypeOfOwner{
    private String ownerName;
    private Integer value;
    private String job;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

    public Owner() {
        this("Ivan");
    }
}
