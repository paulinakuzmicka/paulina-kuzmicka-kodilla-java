package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Bolek", 'M', LocalDate.of(2002, Month.DECEMBER, 5),10));
        forumUserList.add(new ForumUser(2, "Lolek", 'M', LocalDate.of(2007, Month.OCTOBER, 22),0));
        forumUserList.add(new ForumUser(3, "Asterix", 'M', LocalDate.of(1997, Month.DECEMBER, 30),5));
        forumUserList.add(new ForumUser(4, "Tola", 'F', LocalDate.of(1960, Month.APRIL, 25),2));
        forumUserList.add(new ForumUser(5, "Lara Croft", 'F', LocalDate.of(1984, Month.NOVEMBER, 16),7));
        forumUserList.add(new ForumUser(6, "Pafnucy", 'M', LocalDate.of(2000, Month.SEPTEMBER, 17),0));
        forumUserList.add(new ForumUser(7, "Xena", 'F', LocalDate.of(1988, Month.MAY, 25),0));
        forumUserList.add(new ForumUser(8, "Krecik", 'M', LocalDate.of(1990, Month.JULY, 3),3));
        forumUserList.add(new ForumUser(9, "Ronja", 'F', LocalDate.of(1985, Month.SEPTEMBER, 14),4));
        forumUserList.add(new ForumUser(10, "Wonder Woman", 'F', LocalDate.of(1996, Month.OCTOBER, 9),8));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
