package com.example.oopjava.Seminar2.Homework.Task1.Cat;

import com.example.oopjava.Seminar2.Homework.Task1.Cat.Interface.TypeOfCats;

/*Исходил из той логики, что каждый уважающий себя котик имеет хозяйна*/
public class Cat implements TypeOfCats{
    private final Owner owner = new Owner();
    private String name;
    private Integer age;
    private String color;
    private String colorEyes;
    private Integer weight;


    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        if (age == null) {
            this.age = AGE;
        } else {
            this.age = age;
        }
    }

    @Override
    public void setName(String name) {
        if (name == null) {
            this.name = NAME;
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    /*Подумал, что информацию из owner, по условиям задачи лучше брать через создание объекта в классе,
     * а не через наследование*/

    public String getOwnerName() {
        return owner.getOwnerName();
    }


    public void setOwnerName(String ownerName) {
        this.owner.setOwnerName(ownerName);
    }

    public Cat(String name, Integer age) {
        /*На случай если лень самому выдумывать название, подставляем псевдорандомное из трех вариантов*/
        String[] catName = {"Барсик", "Мурзик", "Мурка"};
        if (name.equals("")) {
            this.name = catName[(int) (Math.random() * 3)];
        } else {
            this.name = name;
        }
        this.age = age;
    }

    public Cat() {
        this("", (int) (Math.random() * 18));
    }

    public void greet() {
        System.out.format("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n",
                this.name, this.age, owner.getOwnerName());
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    @Override
    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getColorEyes() {
        return colorEyes;
    }
}
