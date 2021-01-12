package com.nextBaseCRM.tests.homepage_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMethod {
    public static void loginToNextBaseCRM(WebDriver driver){
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("helpdesk15@cybertekschool.com");

        //4. Enter password:
        WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }

}
