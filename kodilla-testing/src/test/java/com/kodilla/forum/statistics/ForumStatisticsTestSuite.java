package com.kodilla.forum.statistics;

import org.junit.*;
import testing.statistics.ForumStatistics;
import testing.statistics.Statistics;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics() {

        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);

        ArrayList<String> usNames = new ArrayList<>();
        usNames.add("Anna");

        when(statistics.usersNames()).thenReturn(usNames);
        when(statistics.postCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(30);

        forumStatistics.caculateAdvStatistics(statistics);

        Assert.assertEquals(1, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(30, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForPosts());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForUsers());
        Assert.assertEquals(0, forumStatistics.getAveragePostsForUsers());
    }

    @Test
    public void testCalculateAdvStatistics1() {

        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);

        ArrayList<String> usNames = new ArrayList<>();
        for(int i = 0 ; i<100 ; i++) {
            usNames.add("Krzysztof");
        }


        when(statistics.usersNames()).thenReturn(usNames);
        when(statistics.postCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(400);

        forumStatistics.caculateAdvStatistics(statistics);


        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(400, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForPosts());
        Assert.assertEquals(4, forumStatistics.getAverageCommentsForUsers());
        Assert.assertEquals(10, forumStatistics.getAveragePostsForUsers());

    }

    @Test
    public void testCalculateAdvStatistics2() {
        Statistics statistics = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);

        ArrayList<String> usNames = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(usNames);
        when(statistics.postCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(50);

        forumStatistics.caculateAdvStatistics(statistics);

        Assert.assertEquals(0, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(50, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForPosts());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsForUsers());
        Assert.assertEquals(0, forumStatistics.getAveragePostsForUsers());
    }
}



