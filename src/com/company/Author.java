package com.company;

public class Author {
    private final String name;
    private final String lastname;

    public Author (String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getLastname() {
        return this.lastname;
    }


}
