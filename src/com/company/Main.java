package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Author Pushkin = new Author("Alexandr", "Pushkin");
        Author Esenin = new Author("Sergey", "Esenin");

        Book oneBook = new Book("Man and dog", Pushkin, 1381);
        Book twoBook = new Book("Man and cat", Esenin, 3085);
        oneBook.setYearPublications(31);
        System.out.println("oneBook.getYearPublications() = " + oneBook.getYearPublications());
        System.out.println("oneBook = " + oneBook);
        System.out.println("twoBook = " + twoBook);

    }
}
