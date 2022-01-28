package com.company;

public class Homework {
    public static Author fullname(String name, String lastName) {
        Author author = new Author();
        author.name = name;
        author.lastName = lastName;
        return author;
    }

    public static void main(String[] args) {
    Author one = fullname("Alexandr", "Pushkin");
        Author two = fullname("Sergey", "Esenin");
        System.out.println("one = " + one.name);
        System.out.println("one = " + one.lastName);
        System.out.println("two = " + two.name);
        System.out.println("two = " + two.lastName);

    }
}
