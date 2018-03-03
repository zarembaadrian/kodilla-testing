package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testListToDoIntoContainer() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        boolean list2Exist = context.containsBean("toDo");

        System.out.println("Bean toDo was found into container: " + list2Exist);

        Assert.assertTrue(list2Exist);

    }

    @Test
    public void testAddTask() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("Name");
        board.getInProgressList().addTask("Name1");
        board.getDoneList().addTask("Name2");

        TaskList taskList = (TaskList) context.getBean("toDo");

        Assert.assertEquals(1,taskList.getTasks().size());

    }
}
