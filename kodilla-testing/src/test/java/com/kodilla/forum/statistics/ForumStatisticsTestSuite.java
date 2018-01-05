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

        ArrayList<String> usNames = new ArrayList<>();
        usNames.add("Wojtek");
        usNames.add("Chris");
        usNames.add("Lucy");
        usNames.add("Mike");
        when(statistics.usersNames()).thenReturn(usNames);
        when(statistics.postCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(30);

        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.caculateAdvStatistics(statistics);
        Assert.assertEquals(4,forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0,forumStatistics.getNumberOfPosts());
    }
}


