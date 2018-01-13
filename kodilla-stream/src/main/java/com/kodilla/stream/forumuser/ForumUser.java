package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userIdentificator;
    private final String userName;
    private final char sex;
    private final LocalDate birthdate;
    private final int userPosts;

    public ForumUser(int userIdentificator, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int userPosts) {
        this.userIdentificator = userIdentificator;
        this.userName = userName;
        this.sex = sex;
        this.birthdate = LocalDate.of(yearOfBirth ,monthOfBirth, dayOfBirth);
        this.userPosts = userPosts;
    }

    public int getUserIdentificator() {
        return userIdentificator;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getUserPosts() {
        return userPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userIdentificator=" + userIdentificator +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", userPosts=" + userPosts +
                '}';
    }
}
