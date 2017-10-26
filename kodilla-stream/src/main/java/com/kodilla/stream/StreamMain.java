package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[]args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser->Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPostsQty()>=1)
                .collect(Collectors.toMap(ForumUser::getIDNumber, ForumUser -> ForumUser));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println);



//        System.out.println("Welcome to module 7 - Stream");
//        Processor processor = new Processor();
//        //Executor codeToExecute = () -> System.out.println("This is an example text.");
//        //processor.execute(codeToExecute);
//        processor.execute(() -> System.out.println("This is an example text."));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        String beautifulText = poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
//        System.out.println(beautifulText);
//
//        String beautifulText2 = poemBeautifier.beautify("Text to beautify", (text -> "ABC" + text + "ABC"));
//        System.out.println(beautifulText2);
//
//        String beautifulText3 = poemBeautifier.beautify("Text to beautify", (text -> text.replace(" ", "*")));
//        System.out.println(beautifulText3);
//
//        String beautifulText4 = poemBeautifier.beautify("Text to beautify", (text -> text.length() + " letters ***" + text + "*** " + text.length() + " letters"));
//        System.out.println(beautifulText4);
//
//        String beautifulText5 = poemBeautifier.beautify("Text to beautify", (text -> text.concat(String.valueOf(text.hashCode()))));
//        System.out.println(beautifulText5);
//
//        String beautifulText6 = poemBeautifier.beautify("Tomek Z. rules!!!", (text -> {
//            StringBuilder sb = new StringBuilder();
//            sb.append("|");
//            for (int i = 0; i < text.length(); i++) {
//                sb.append(text.charAt(i));
//                sb.append("|");
//            }
//            return sb.toString();
//        }));
//        System.out.println(beautifulText6);

//        String beautifulText7 = poemBeautifier.beautify("Tomek Z. rules!!!", (text -> text.chars()
//                .mapToObj(i -> Character.toString((char) i))
//                .collect(Collectors.joining("|"))
//        ));
//        System.out.println(beautifulText7);
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//
//        People.getList().stream()
//                .map(s -> s.toUpperCase())  //.map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);  //.forEach(s -> System.out.println(s));

//        BookDirectory theBookDirectory = new BookDirectory();

//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);


    }
}
