package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_registerPom;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D1_registerStepDefinations {
    P01_registerPom register=new P01_registerPom();

    @Given("user go to register page")
    public void register_page()
    {
        register.registerLink().click();
    }
    @When("user enter gender type")
    public void userChooseGender () {
        register.Gender().click();
    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void enterData () {
    register.firstName().sendKeys("automation");
        register.LastName().sendKeys("tester");

    }
    @And("user enter date of birth")
    public void enterBirthDate () {
        Select select = new Select(register.BirthDay());
        select.selectByIndex(5);

        select = new Select(register.Month());
        select.selectByVisibleText("August");

        select = new Select(register.Year());
        select.selectByValue("2000");
    }
    @And ("user enter email and companyName")
    public void emailAndCompany () {
        register.Email().sendKeys("mohamed@gmail.com");
        register.company().sendKeys("Valeo");
    }

    @And("user fills Password fields \"123456\" \"123456\"")
    public void enterPassword () {
        register.Password().sendKeys("123456");
        register.ConfirmationOfPassword().sendKeys("123456");
    }
    @And("user clicks on register button")
    public void regButton () {
       register.registerButton().click();
    }
    @Then("success message is displayed")
    public void SuccessMessage () {
        // 1st Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(register.sucssesMasege().isDisplayed(), "Success Message");
        // 2nd Assertion
        String actual = register.sucssesMasege().getCssValue("color");
        soft.assertEquals(actual,"rgba(76, 177, 124, 1)" , "color");
        // Assert All
        soft.assertAll();

    }


}
