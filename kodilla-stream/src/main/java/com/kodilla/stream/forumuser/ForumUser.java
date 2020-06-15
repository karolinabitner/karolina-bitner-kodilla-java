package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String name;
    private char sex;
    private LocalDate dateOfBirth;
    private int postQuantity;

    public ForumUser(int id, String name, char sex, LocalDate dateOfBirth, int postQuantity) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postQuantity = postQuantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
