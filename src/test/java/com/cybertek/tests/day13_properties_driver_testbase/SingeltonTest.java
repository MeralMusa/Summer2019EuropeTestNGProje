package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.utulities.ConfigurationReader;
import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingeltonTest {

    @Test
            public void test() {
        String s1 = Singelton.getInstance();
        String s2 = Singelton.getInstance();


        System.out.println("s1 =" + s1);
        System.out.println("s2 =" + s2);


    }

    @Test
    public void test2(){


        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://google.com");

        driver.get(ConfigurationReader.get("url"));
    }

       @Test
    public void test3() throws InterruptedException {

        Thread.sleep(2000);


    }
}
