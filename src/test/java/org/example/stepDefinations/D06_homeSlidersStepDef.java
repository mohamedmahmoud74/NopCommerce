package org.example.stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_homePagePom;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

    P04_homePagePom Home=new P04_homePagePom();
    @When("user can click on first slider")
    public void userCanClickOnFirstSlider()
    {

        Home.firstSlider().click();
        Home.clickOfSlider(1);

    }

    @Then("navigate to the page of first slider")
    public void navigateToThePageOfFirstSlider() {
        String actualResult=Hooks.driver.getCurrentUrl();
        String expectedResult=" https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(actualResult,expectedResult,"This is First Url");

    }

    @When("user can click on second slider")
    public void userCanClickOnSecondSlider() {
        Home.secondSlider().click();
        Home.clickOfSlider(2);
    }

    @Then("navigate to the page of second slider")
    public void navigateToThePageOfSecondSlider() {
        String actualResult2=Hooks.driver.getCurrentUrl();
        String expectedResult2="https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(actualResult2,expectedResult2,"This is second Url");

    }
}
