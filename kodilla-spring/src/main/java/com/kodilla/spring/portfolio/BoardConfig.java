package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name = "toDo")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "done")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
