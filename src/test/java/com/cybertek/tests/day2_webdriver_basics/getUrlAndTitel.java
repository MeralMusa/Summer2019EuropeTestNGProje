package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitel {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://practice.cybertekschool.com");


        String titel=driver.getTitle();
        //soutv
        System.out.println("titel = " + titel);
        
        String currentUrl=driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        String pageSource = driver.getPageSource();

        System.out.println("pageSource = " + pageSource);



    }
}
