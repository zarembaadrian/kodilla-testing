package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testListToDoIntoContainer() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        boolean list2Exist = context.containsBean("ToDo");

        System.out.println("Bean ToDo was found into container: " + list2Exist);
    }

    @Test
    public void testAddTask() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board board = context.getBean(Board.class);

        board.getDoneList();
    }
}
