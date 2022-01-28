package com.company;

public class Book {
    String nameBook;
    Author fullName;
    int yearPublications;
    public static Book look(String nameBook, Author fullName, int yearPublications) {
        Book book = new Book();
        book.nameBook = nameBook;
        book.fullName = fullName;
        book.yearPublications = yearPublications;
        return book;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getFullName() {
        return fullName;
    }

    public int getYearPublications() {
        return this.yearPublications;
    }

    public void setYearPublications(int yearPublications) {
        this.yearPublications = yearPublications;
    }
}
