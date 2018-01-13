package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(01,"Adrian", 'm', 1996, 12,16,35));
        theForumUserList.add(new ForumUser(02,"Joseph", 'm',1981,11,5,1));
        theForumUserList.add(new ForumUser(03,"Maria", 'f',1994,05,13,2));
        theForumUserList.add(new ForumUser(04,"Elizabeth", 'f', 2000,07,20,6));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
