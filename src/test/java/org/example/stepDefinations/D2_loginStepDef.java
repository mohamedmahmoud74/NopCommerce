package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.example.Pages.P02_LoginPom;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefinations.Hooks.driver;

public class D2_loginStepDef {
P02_LoginPom login=new P02_LoginPom();
@Given("user navigate to login page")
    public void navigateToLogin()
{
  login.NavigateToLoginPage().click();

}
    @When("login with valid \"(.*)\" and \"(.*)\"$")
    public void vaild_data(String email, String password) throws InterruptedException {
        login.Login(email, password);
        Thread.sleep(3000);
    }


    public void validData(String email, String password) throws InterruptedException {
       login.Login(email,password);
//        login.enterEmail().sendKeys("mohamedm.salem19972020@gmail.com");
//        login.enterPassword().sendKeys("P@ssw0rd");
        Thread.sleep(4000);
    }

@Then("user press on login button")
public void loginButton()

{
login.enterPassword().sendKeys(Keys.ENTER);
}
@And("user login to the system successfully")

        public void loginsuccess()

    {
    SoftAssert soft = new SoftAssert();
    soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","URL login is correct");
    driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed();
    soft.assertTrue(login.myAccount().isDisplayed(), "My Account login successfly ");
    soft.assertAll();

}
    @When("login with invalid email \"(.*)\" and invalid password \"(.*)\"$")
    public void Invaild_data(String email, String password) throws InterruptedException {
        login.Login(email,password);
        Thread.sleep(4000);
    }
    @And("user could not login to the system")

    public void loginfailed()

    {SoftAssert soft = new SoftAssert();
        soft = new SoftAssert();
        login.logFailed().isDisplayed();
        String actual = login.logFailed().getText();
        soft.assertEquals(actual,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Wrong Message");
        actual = login.logFailed().getCssValue("color");
        soft.assertEquals(actual, "rgba(228, 67, 75, 1)", "color");
        soft.assertAll();
    }



}
