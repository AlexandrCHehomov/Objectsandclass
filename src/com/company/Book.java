package com.company;

public class Book {
    private final String nameBook;
    private final Author fullName;

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", fullName=" + fullName +
                ", yearPublications=" + yearPublications +
                '}';
    }

    private int yearPublications;
    public Book(String nameBook, Author fullName, int yearPublications) {
        this.nameBook = nameBook;
        this.fullName = fullName;
        this.yearPublications = yearPublications;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getFullName() {
        return this.fullName;
    }

    public int getYearPublications() {
        return this.yearPublications;
    }

    public void setYearPublications(int yearPublications) {
        this.yearPublications = yearPublications;
    }
}
