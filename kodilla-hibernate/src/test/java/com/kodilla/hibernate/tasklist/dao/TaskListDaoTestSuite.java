package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String listName = "To Do";
    private static final String description1 = "1st List with tasks to do";
    private static final String description2 = "2nd List with tasks to do";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList1 = new TaskList(listName, description1);
        TaskList taskList2 = new TaskList(listName, description2);

        //When
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        Assert.assertEquals(2, readTaskList.size());
        Assert.assertEquals(listName, readTaskList.get(0).getListName());
        Assert.assertEquals(listName, readTaskList.get(1).getListName());

        //CleanUp
        taskListDao.delete(taskList1);
        taskListDao.delete(taskList2);
    }
}
