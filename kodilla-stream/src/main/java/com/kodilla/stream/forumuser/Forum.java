package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Forum {
    private final List<Book> theForumList = new ArrayList<>();

    public Forum(){
        theForumList.add(new ForumUser(1, "kasiaw", 'F', new LocalDate(2000, 02, 13), 10));
        theForumList.add(new ForumUser(2, "piotrek", 'M', new LocalDate(1980, 12, 03), 100));
        theForumList.add(new ForumUser(3, "qksi", 'M', new LocalDate(1994, 02, 02), 99));
        theForumList.add(new ForumUser(4, "PIOTREK_W", 'M', new LocalDate(2002, 03, 05), 110));
        theForumList.add(new ForumUser(5, "Barteliński", 'M', new LocalDate(1998, 10, 27), 45));
        theForumList.add(new ForumUser(6, "nati95", 'F', new LocalDate(1995, 02, 17), 83));
        theForumList.add(new ForumUser(7, "anonim", 'F', new LocalDate(1965, 06, 19), 1));
        theForumList.add(new ForumUser(8, "lubie_placki_xd", 'M', new LocalDate(2001, 04, 28), 20));
        theForumList.add(new ForumUser(9, "michał", 'M', new LocalDate(2000, 8, 07), 8));
        theForumList.add(new ForumUser(10, "Olga_krk", 'F', new LocalDate(1990, 07, 13), 7));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumList);
    }
}
