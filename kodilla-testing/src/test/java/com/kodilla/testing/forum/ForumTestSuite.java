package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Before
    public void before() {
        System.out.println("Test case: begin ");
    }
    @After
    public void after() {
        System.out.println("Test case: end ");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite: end");
    }

    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleuser = new SimpleUser("Dog", "Adrian" );
        //When
        String result = simpleuser.getUsername();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("Dog", result);
    }
    @Test
    public void testCaseRealname() {

        SimpleUser simpleuser = new SimpleUser("Dog", "Adrian");

        String result = simpleuser.getRealname();
        System.out.println("Testing " + result);

        Assert.assertEquals("Adrian", result);
    }

}
