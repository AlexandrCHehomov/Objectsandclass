package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here

        Book oneBook = new Book("Man and dog", new Author("Alexandr Pushkin"), 1381);
        Book twoBook = new Book("Man and cat", new Author("Sergey Esenin"), 3085);
        oneBook.setYearPublications(31);
        System.out.println("oneBook.getYearPublications() = " + oneBook.getYearPublications());
        System.out.println("oneBook = " + oneBook);
        System.out.println("twoBook = " + twoBook);

    }
}
