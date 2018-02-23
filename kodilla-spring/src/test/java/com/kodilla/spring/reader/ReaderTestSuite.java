package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    public void testReader() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);

        Reader reader = context.getBean(Reader.class);

        reader.read();
    }
    @Test
    public void testConditional() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);

        boolean book2Exist = context.containsBean("book2");

        System.out.println("Bean book2 was found into cointernergit" + book2Exist);
    }
}
