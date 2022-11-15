package org.example.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_homePagePom;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.List;

public class D4_searchStepDef {
  P04_homePagePom homepage=new P04_homePagePom();
  String[] Values= {"book","laptop","nike"};
  @When("user search click on search field")
  public void usersearchclickonsearchfield()
  {
    homepage.searchInput().click();
  }

  @And("user search with {string}")
  public void userSearchWith(String product) {
    homepage.searchInput().sendKeys(product);
    homepage.searchingButton().click();
  }

  @Then("user could find {string}")
  public void userCouldFind(String product) {
    for (int x = 0; x < homepage.prodacts().size(); x++) {
      String Text = homepage.prodacts().get(x).getText();
      Assert.assertTrue(Text.toLowerCase().contains(product));

    }
  }

  @Then("user could find {string} inside product details page")
  public void userCouldFindInsideProductDetailsPage(String SKU) {
    homepage.ProductDetails().click();
    Assert.assertTrue(homepage.ProductSku().getText().contains(SKU));
  }


}
