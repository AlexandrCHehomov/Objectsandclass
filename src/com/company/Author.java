package com.company;

public class Author {
    String name;
    String lastName;
    public static Author fullname(String name, String lastName) {
        Author author = new Author();
        author.name = name;
        author.lastName = lastName;
        return author;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

}
