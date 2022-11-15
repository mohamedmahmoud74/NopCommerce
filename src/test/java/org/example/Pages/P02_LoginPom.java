package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefinations.Hooks.driver;

public class P02_LoginPom {

    public WebElement NavigateToLoginPage() {
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement enterEmail() {
        return driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword() {
        return driver.findElement(By.id("Password"));
    }

    public void Login(String email ,String password)
    {
        enterEmail().clear();
        enterPassword().clear();

        enterEmail().sendKeys( email );
        enterPassword().sendKeys( password );
    }
    public WebElement myAccount() {
        return driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement logFailed() {
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

}
