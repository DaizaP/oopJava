package com.example.oopjava.Seminar1.Homework.Task2;

public class Rectangle {
    private Integer width;
    private Integer height;

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getWidth() {
        return width;
    }

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(5, 4);
    }

    public Integer calculateArea() {
        return this.width * this.height;
    }
    public  Integer calculatePerimeter(){
        return 2*(this.width+this.height);
    }
}
