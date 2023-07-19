package com.example.oopjava.Seminar7.Homework.Model;

abstract class Complex implements Model {
    private Double real;
    private Double real2;
    private Double image;
    private Double image2;

    public Double getReal() {
        return real;
    }

    public Double getReal2() {
        return real2;
    }

    public Double getImage() {
        return image;
    }

    public Double getImage2() {
        return image2;
    }

    @Override
    public void real(String value) {
        this.real = Double.parseDouble(value);
    }

    @Override
    public void real2(String value) {
        this.real2 = Double.parseDouble(value);
    }

    @Override
    public void image(String value) {
        this.image = Double.parseDouble(value.substring(0, value.length() - 1));
    }

    @Override
    public void image2(String value) {
        this.image2 = Double.parseDouble(value.substring(0, value.length() - 1));
    }

}
