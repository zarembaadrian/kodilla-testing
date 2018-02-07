package com.kodilla.forum;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ForumTestSuite {

    @Test
    public void testGetUserName() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");

        ForumUser user = context.getBean(ForumUser.class);

        String name = user.getUserName();

        Assert.assertEquals("John Smith", name);
    }
}
