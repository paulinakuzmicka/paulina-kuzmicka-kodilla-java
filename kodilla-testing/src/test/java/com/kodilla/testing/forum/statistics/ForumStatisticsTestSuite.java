package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsWithZeroPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then

        assertEquals(0, forumStatistics.getPostsQty());

        assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);

        assertEquals(0, forumStatistics.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithThousandPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then

        assertEquals(1000, forumStatistics.getPostsQty());

        assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);

        assertEquals(0, forumStatistics.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then

        assertEquals(0, forumStatistics.getCommentsQty());
        assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then

        assertEquals(10, forumStatistics.getPostsQty());
        assertEquals(2, forumStatistics.getCommentsQty());
        assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(0.2, forumStatistics.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(2);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then

        assertEquals(2, forumStatistics.getPostsQty());
        assertEquals(10, forumStatistics.getCommentsQty());
        assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
        assertEquals(5, forumStatistics.getCommentsAvgPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUsersQty());

        assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWithHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<100; i++){
            usersList.add("user");
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersQty());
        assertEquals(0, forumStatistics.getPostsAvgPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgPerUser(), 0.01);
    }
}