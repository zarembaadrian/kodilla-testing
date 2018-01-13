package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultsOfMaps = forum.getList().stream()
                .filter(forumUser -> forumUser.getBirthdate().getYear() < 1997)
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getUserPosts() > 1)
                .collect(Collectors.toMap(forumUser -> forumUser.getUserIdentificator(), forumUser -> forumUser));

        System.out.println("#. elements" + theResultsOfMaps.size());

        theResultsOfMaps.entrySet().stream().
                map(entry -> entry.getKey() + " " + entry.getValue()).forEach(System.out::println);

        }
}
