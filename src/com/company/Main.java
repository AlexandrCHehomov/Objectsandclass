package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Author one = Author.fullname("Alexandr", "Pushkin");
        Author two = Author.fullname("Sergey", "Esenin");
        System.out.println("one = " + one.name + " " + one.lastName);
        System.out.println("two = " + two.name + " " + two.lastName);
        Book oneBook = Book.look("Man and dog", Author.fullname("Alexandr", "Pushkin"), 1323);
        Book twoBook = Book.look("Man and cat", Author.fullname("Sergey", "Esenin"), 835);
        oneBook.setYearPublications(31);
        System.out.println("oneBook.getYearPublications() = " + oneBook.getYearPublications());
        System.out.println("oneBook = " + oneBook.nameBook + " " + oneBook.fullName + " " + oneBook.yearPublications);
        System.out.println("twoBook = " + twoBook.nameBook + " " + twoBook.fullName + " " + twoBook.yearPublications);

    }
}
