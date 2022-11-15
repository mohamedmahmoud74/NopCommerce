package org.example.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_currenciesPom;
import org.example.Pages.P04_homePagePom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D3_currenciesStepDef {

    @Given("CLick on Currencues LOV")
    public  void OpenCurrenciesLOV(){
        HomePage.ProductCurrency().click();
    }
   // P03_currenciesPom currencies=new P03_currenciesPom();
     P04_homePagePom HomePage= new P04_homePagePom();
    @When("user can select Euro from currency dropdown")
    public  void SelectCurrencies(){
        HomePage.Euro().click();

    }

    @Then("All dollar sign change to Euro sign")
    public void EuroSign() {
        for (int x = 0; x < HomePage.Elements().size(); x++) {
            String Text = HomePage.Elements().get(x).getText();
            Assert.assertTrue(Text.contains("€"));

        }
    }

    }
// Hooks.driver.findElements(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).size();
//            String text = currencies.Price().getText();
//            Assert.assertTrue(text.contains("€"));


