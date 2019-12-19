package com.cybertek.tests.TestCases;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.de/");

        WebElement SerchField= driver.findElement(By.xpath("//*[@id='gh-ac']"));

        SerchField.sendKeys("Iphone");


        WebElement SearchButton= driver.findElement(By.xpath("//input[@value='Finden']"));



        SearchButton.click();

        WebElement Result= driver.findElement(By.xpath("//*[@id='cbelm']/div[3]/h1/span[1]"));

        Result.getText();

        String result=Result.getText();


        System.out.println(result);


        driver.quit();
    }
}