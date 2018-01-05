package testing.statistics;

public class ForumStatistics {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsForUsers;
    double averageCommentsForUsers;
    double averageCommentsForPosts;
    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void caculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentsCount();
        if(statistics.usersNames().isEmpty() && statistics.postCount()>0 ) {
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

    public double getAveragePostsForUsers() {
        return averagePostsForUsers;
    }

    public double getAverageCommentsForUsers() {
        return averageCommentsForUsers;
    }

    public double getAverageCommentsForPosts() {
        return averageCommentsForPosts;
    }
}
