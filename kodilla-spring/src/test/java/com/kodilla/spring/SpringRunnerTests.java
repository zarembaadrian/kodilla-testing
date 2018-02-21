package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTests {


    @Test
	public void testCircleLoadedIntoContainer() {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

		Shape shape = (Shape)context.getBean("circle");

		String name = shape.getShapeName();

		Assert.assertEquals("This is circle", name);
	}

	@Test
	public void testTriangleLoadedIntoContainer() {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("triangle");
		String name = shape.getShapeName();

		Assert.assertEquals("This is triangle", name);
	}

    @Test
    public void testGetUserName() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        ForumUser user = context.getBean(ForumUser.class);

        String name = user.getUserName();

       Assert.assertEquals("John Smith", name);
    }
    @Test
	public void testSquareLoadedIntoContainer() {
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

    	Shape shape = (Shape)context.getBean("square");

		String name = shape.getShapeName();

		Assert.assertEquals("This is square", name);

	}
	@Test
	public void testShapeLoadedIntoContainer() {

    	ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

    	Shape shape = (Shape)context.getBean("choosenShape");

    	String name = shape.getShapeName();

    	System.out.println("Choosen shape type: " + name);

	}

}
