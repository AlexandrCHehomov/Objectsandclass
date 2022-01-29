package com.company;

public class Book {
    String nameBook;
    Author name;
    int yearPublications;
    public Book(String nameBook, Author name, int yearPublications) {
        this.nameBook = nameBook;
        this.name = name;
        this.yearPublications = yearPublications;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getName() {
        return this.name;
    }

    public int getYearPublications() {
        return this.yearPublications;
    }

    public void setYearPublications(int yearPublications) {
        this.yearPublications = yearPublications;
    }
}
