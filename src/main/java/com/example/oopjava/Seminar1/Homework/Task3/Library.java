package com.example.oopjava.Seminar1.Homework.Task3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        try {
            catalog.remove(book);
        } catch (Exception e) {
            System.out.println("Ошибка! Попробуйте ещё раз.\n Текст ошибки: " + e);
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\u001B[33mAvailable books.\u001B[0m");
        for (Book book : catalog) {
            if (book.getAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.println("\u001B[33mAutor "+ author + "\u001B[0m");
        catalog.forEach(book -> {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        });
    }
}
