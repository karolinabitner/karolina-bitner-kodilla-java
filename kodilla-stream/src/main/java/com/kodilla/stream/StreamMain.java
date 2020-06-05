package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //System.out.println("Calculating expressions with lambdas");
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        //PoemBeautifier poemBeautifier = new PoemBeautifier();
        //String Text1 = poemBeautifier.beautify(" Example test 1: ", (text -> "ABC" + text + "ABC"));
        //System.out.println(Text1);
        //String Text2 = poemBeautifier.beautify(" Example text 2: ", (text -> text.length() + text));
        //System.out.println(Text2);
        //String Text3 = poemBeautifier.beautify(" Example text 3: ", (text -> text.toUpperCase()));
        //System.out.println(Text3);
        //String Text4 = poemBeautifier.beautify(" Example text 4: ", (text -> text.replace("e","k")));
        //System.out.println(Text4);


        //People.getList().stream()
                //.map(s -> s.toUpperCase())
                //.filter(s -> s.length()>11)
                //.map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                //.filter(s -> s.substring(0, 1).equals("M"))
                //.forEach(System.out::println);

        Forum theForumList = new Forum();
        theForumList.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().)
                .filter(forumUser -> forumUser.getPostQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        theForumList.stream()
                .forEach(System.out::println);
    }
}
