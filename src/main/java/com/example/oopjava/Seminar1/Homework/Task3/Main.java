package com.example.oopjava.Seminar1.Homework.Task3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("book1", "Ivan", true);
        Book book2 = new Book("book2", "Ivan", false);
        Book book3 = new Book("book3", "Dima");
        Book book4 = new Book("book4", "Ivan");
        Book book5 = new Book("book5", "Denis");
        book3.setAvailable(false);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.removeBook(book4);
        library.displayAvailableBooks();
        library.searchByAuthor("Ivan");

    }

}
