package com.example.oopjava.Seminar1.Homework.Task1;

public class Owner{
    protected String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public Owner(String ownerName){
        this.ownerName = ownerName;
    }
    public Owner(){
        this("Ivan");
    }
}
