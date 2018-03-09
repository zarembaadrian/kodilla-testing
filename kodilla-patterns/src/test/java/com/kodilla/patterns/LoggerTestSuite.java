package com.kodilla.patterns;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void setName() {
        Logger.getInstance().log("Gucci");
    }

    @Test
    public void testGetLastLog() {
        String result = Logger.getInstance().getLastLog();

        Assert.assertEquals("Gucci", result);
    }
}
