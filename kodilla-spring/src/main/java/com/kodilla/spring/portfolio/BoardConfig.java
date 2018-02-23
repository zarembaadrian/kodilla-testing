package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("ToDo")
    Board board;

    public TaskList getTaskList() {
        return new TaskList();
    }

    @Bean(name = "ToDo")
    @Scope("prototype")
    public Board getToDoBoard() {
        return new Board(new TaskList(),new TaskList(),new TaskList());
    }

    @Bean(name = "InProgessList")
    @Scope("prototype")
    public Board getInProgressBoard() {
        return new Board(new TaskList(),new TaskList(),new TaskList());
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public Board getDoneBoard() {
        return new Board(new TaskList(),new TaskList(),new TaskList());
    }
}
