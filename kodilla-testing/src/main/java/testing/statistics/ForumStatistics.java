package testing.statistics;

public class ForumStatistics {
 private int numberOfUsers;
 private int numberOfPosts;
 private int numberOfComments;
 private int averagePostsForUsers;
 private int averageCommentsForUsers;
 private int averageCommentsForPosts;
 private  Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void caculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentsCount();

        if(statistics.postCount()>0 && statistics.commentsCount()>0  )
        {
            averagePostsForUsers = (statistics.postCount()) / (statistics.usersNames().size());
            averageCommentsForUsers = (statistics.commentsCount()) / (statistics.usersNames().size());
            averageCommentsForPosts = (statistics.commentsCount()) / (statistics.postCount());
        }

    }

    public void showStatistics() {
        System.out.println(numberOfPosts);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAveragePostsForUsers() {
        return averagePostsForUsers;
    }

    public int getAverageCommentsForUsers() {
        return averageCommentsForUsers;
    }

    public int getAverageCommentsForPosts() {
        return averageCommentsForPosts;
    }
}

