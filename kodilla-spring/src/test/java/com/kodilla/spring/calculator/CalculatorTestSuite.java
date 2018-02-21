package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculation() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        Assert.assertEquals(4,calculator.add(2,2), 0.2);
        Assert.assertEquals(2,calculator.sub(4,2), 0.1);
        Assert.assertEquals(16,calculator.mul(4,4), 0.1);
        Assert.assertEquals(1,calculator.div(36,36), 0.1);

        calculator.add(4,20);
    }
}
