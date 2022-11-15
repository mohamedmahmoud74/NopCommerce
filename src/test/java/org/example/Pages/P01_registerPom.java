package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefinations.Hooks.driver;

public class P01_registerPom {

    public WebElement registerLink()
    {
        WebElement reg= driver.findElement(By.linkText("Register"));
        return reg;
    }
    public WebElement Gender()
    {
        WebElement gender=driver.findElement(By.id("gender-male"));
        return gender;
    }
    public WebElement firstName()
    {
        WebElement fName=driver.findElement(By.id("FirstName"));
        return fName;
    }
    public WebElement LastName()
    {
        WebElement lName=driver.findElement(By.id("LastName"));
        return lName;


    }
    public WebElement BirthDay()
    {
        WebElement day= driver.findElement(By.name("DateOfBirthDay"));
        return day;

    }
    public WebElement Month()
    {
        WebElement months=driver.findElement(By.name("DateOfBirthMonth"));
        return months;

    }
    public WebElement Year()
    {
        WebElement years=driver.findElement(By.name("DateOfBirthYear"));
        return years;


    }
    public WebElement company()
    {
        WebElement companyname=driver.findElement(By.id("Company"));
        return companyname;


    } public WebElement Email()
    {
        WebElement email=driver.findElement(By.id("Email"));
        return email;


    }
    public WebElement Password()
    {
        WebElement pass= driver.findElement(By.id("Password"));
        return pass;

    }
    public WebElement ConfirmationOfPassword()
    {
        WebElement pass2=driver.findElement(By.id("ConfirmPassword"));
        return pass2;

    }
    public WebElement registerButton()
    {
        WebElement buton=driver.findElement(By.id("register-button"));

        return buton;
    }
     public WebElement sucssesMasege()
    {
        WebElement message=driver.findElement(By.xpath("//div[@class=\"result\"]"));
        return message;

    }


}







