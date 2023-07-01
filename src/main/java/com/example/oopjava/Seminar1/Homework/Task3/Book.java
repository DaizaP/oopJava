package com.example.oopjava.Seminar1.Homework.Task3;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean getAvailable(){
        return available;
    }
    public Book(String title, String author, boolean available){
        this.title= title;
        this.author = author;
        this.available = available;
    }
    public Book(String title, String author){
        this(title, author, true);
    }
    public void displayInfo(){
        if(available){
            System.out.println("----------" +
                    "\nНазвание: " + title +
                    "\nАвтор: " + author +
                    "\nДоступность: Свободна.");
        } else {

            System.out.println("----------" +
                    "\nНазвание: " + title +
                    "\nАвтор: " + author +
                    "\nДоступность: Занята.");
        }
    }
}
