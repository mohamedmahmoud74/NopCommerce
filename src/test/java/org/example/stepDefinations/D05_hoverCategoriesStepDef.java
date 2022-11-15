package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_homePagePom;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D05_hoverCategoriesStepDef {
    P04_homePagePom homePage =new P04_homePagePom();
    String subCategorieName;
    List<WebElement> categories;
    List <WebElement> subCategories;
    @When("user hover on random category")
    public void randomHover()
    {
        categories=homePage.categories();
        homePage.randomHover(categories);

    }

    @And("user click on random sub-category")
    public void userClickOnRandomSubCategory() {
        subCategories=homePage.sub_catigory();
        subCategorieName=homePage.clickOnSubCatigoures(subCategories);

    }

    @Then("validate sub category page title")
    public void validateSubCategoryPageTitle() {

        System.out.println(subCategorieName);
        System.out.println(homePage.subCatigoryTitle());

        //homePage.getSubCatigoryTitle(homePage.subCatigoryTitle());
        Assert.assertEquals(homePage.getSubCatigoryTitle(homePage.subCatigoryTitle()),subCategorieName);
    }


}