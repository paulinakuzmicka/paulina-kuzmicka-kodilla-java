package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int IDnumber;
    private String name;
    private char sex;
    private LocalDate birthdayDate;
    private int postsQty;

    public ForumUser(int IDnumber, String name, char sex, LocalDate birthdayDate, int postsQty) {
        this.IDnumber = IDnumber;
        this.name = name;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postsQty = postsQty;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostsQty() {
        return postsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IDnumber=" + IDnumber +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postsQty=" + postsQty +
                '}';
    }
}
