package com.kodilla.stream.book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BookDirectory {
    private final List<Book> theForumList = new ArrayList<>();

    public BookDirectory() {
        theForumList.add(new Book("Dyylan Murphy", "Wolf of the mountains", 2003));
        theForumList.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012));
        theForumList.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001));
        theForumList.add(new Book("Aimee Murphy", "Rejecting the night", 2015));
        theForumList.add(new Book("Ryan Talley", "Gangsters and kings", 2007));
        theForumList.add(new Book("Madelynn Carson", "Unity without duty", 2007));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity", 2009));
    }

    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }
}
