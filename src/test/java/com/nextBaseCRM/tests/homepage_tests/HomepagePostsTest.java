package com.nextBaseCRM.tests.homepage_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomepagePostsTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverUtility.getDriver("chrome");
        driver = new ChromeDriver();

        driver.get("http://login2.nextbasecrm.com");

        //maximize
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginMethod.loginToNextBaseCRM(driver);

    }

    @Test
    public void test1_See_Homepage(){

        String expectedUrl = "https://login2.nextbasecrm.com/stream/?login=yes";
String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.equals(expectedUrl));

driver.findElement(By.xpath("//a[@class='bx-ilike-text']")).click();

driver.findElement(By.xpath("//a[@class='bx-ilike-text']")).click();

driver.findElement(By.xpath("//div/span[3]/a")).click();

driver.findElement(By.id("feed-post-contentview-cnt-BLOG_POST-2929")).getSize();

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}
