package com.kodilla.patterns;

import com.kodilla.patterns.singleton.SettingsFileEngine;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;


    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSetttingsFile() {
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened:" + fileName);
        Assert.assertEquals("myapp.settings", fileName);
    }
    @Test
    public void testLoadSettings() {
        boolean result = SettingsFileEngine.getInstance().loadSetting();
        Assert.assertTrue(result);
    }
    @Test
    public void testSavingSettings() {
        boolean result = SettingsFileEngine.getInstance().saveSetting();
        Assert.assertTrue(result);
    }
}
