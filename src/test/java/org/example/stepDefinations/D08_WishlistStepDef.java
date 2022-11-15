package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_homePagePom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;
import java.time.Duration;

public class D08_WishlistStepDef {
    P04_homePagePom wishList =new P04_homePagePom();

    @When("user add product to wishlist")
    public void addProduct()
    {

        wishList.wishlist().get(2).click();

    }


    @Then("wishlist give user message of adding product")
    public void wishlistGiveUserMesageOfAddingProduct()
    {
        SoftAssert soft=new SoftAssert();

        soft.assertTrue(wishList.successMeasege().isDisplayed(), "Success Message");

        String actual = wishList.successMeasege().getCssValue("background-color");
        String expected = "rgba(221, 221, 221, 1)";
        soft.assertEquals(actual, expected, "Message color");
        soft.assertAll();

    }

    @And("Wait until Massage is disappeared")
    public void waitUntilMassageIsDisappeared() {
        WebDriverWait wait= new WebDriverWait(Hooks.driver, Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("close")));
    }

    @And("user get the number of wishlist items after adding product")
    public void userGetTheNumberOfWishlistItemsAfterAddingProduct() {
        wishList.WishlistButton().click();
    }

    @Then("verify Qty greater than Zero")
    public void verifyQtyGreaterThanZero() {
        String Qty = wishList.Qtyfield().getAttribute("value");
        int Qty_numbwer = Integer.parseInt(Qty);
        Assert.assertTrue( Qty_numbwer >= 1 ? true : false );
    }
}
