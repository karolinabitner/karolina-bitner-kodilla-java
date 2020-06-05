package com.kodilla.stream.book;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Book(final String author, final String title, final int yearOfPubication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPubication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPubication=" + yearOfPublication +
                '}';
    }

}
