package com.cybertek.tests.TestCases;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.image.TileObserver;

public class TestCase2 {

    public static void main(String[] args) {





        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://wwww.amazon.com");


        driver.get("https://www.ebay.de/");

        WebElement SerchField= driver.findElement(By.xpath("//*[@id='gh-ac']"));

        SerchField.sendKeys("Iphone");


        WebElement SearchButton= driver.findElement(By.xpath("//input[@value='Finden']"));



        SearchButton.click();


        String SearchTerm="Iphone";

        WebElement Titel=driver.findElement(By.xpath("//b[.='Iphone']"));

        Titel.getText();

        String title=  Titel.getText();



        if (SearchTerm.equals(Titel.getText())){

            System.out.println("Pass");


        }else{

            System.out.println("Faild");

            System.out.println(SearchTerm);
            System.out.println(Titel.getText());
        }




        driver.quit();
    }
}
