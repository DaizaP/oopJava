package com.example.oopjava.Seminar1.Homework.Task1;

/*Исходил из той логики, что каждый уважающий себя котик имеет хозяйна*/
public class Cat {
    private final Owner owner = new Owner();
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    /*Подумал, что информацию из owner, по условиям задачи лучше брать через создание объекат в классе,
    * а не через наследование*/
    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public void setOwnerName(String ownerName) {
        this.owner.setOwnerName(ownerName);
    }


    public Cat(String name, Integer age) {
        /*На случай если лень самому выдумывать название, подставляем пседорандомное из трех вариантов*/
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
}
