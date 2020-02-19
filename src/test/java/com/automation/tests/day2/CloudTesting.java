package com.automation.tests.day2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CloudTesting {

    public static String userName = "umituzulmez1";
    public static String accessKey = "CXvwwmzxzAHc5VMnQ8Yp";
    public static String URL = "https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
    private AppiumDriver driver;

    @Test
    public void test1() throws Exception{
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("device", "Google Pixel 4");
        desiredCapabilities.setCapability("os_version", "10.0");
        desiredCapabilities.setCapability("project", "Calculator");
        desiredCapabilities.setCapability("build", "My First Build");
        desiredCapabilities.setCapability("name", "Calculator Test");
        desiredCapabilities.setCapability("app", "bs://4f2361071a8857b7ecf08eb9ccae8325c879b2b9");

        driver = new AndroidDriver<>(new URL(URL),desiredCapabilities);

        Thread.sleep(5000);
        driver.close();
    }
}
