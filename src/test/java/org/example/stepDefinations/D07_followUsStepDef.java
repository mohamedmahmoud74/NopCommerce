package org.example.stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_homePagePom;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
     P04_homePagePom homeFollow=new P04_homePagePom();
     
     @When("user opens facebook link")
     public  void openFacebook()
     {
         homeFollow.facebook().click();
     }
    @Then("facebook is Opened in a new tab")
    public void facebookIsOpenedInANewTab()

    {
        homeFollow.assertFacebook();
//        ArrayList<String> tab=new ArrayList<String>(Hooks.driver.getWindowHandles());
//        Hooks.driver.switchTo().window(tab.get(1));
//        String actual=Hooks.driver.getCurrentUrl();
//        String expexted= "https://www.facebook.com/nopCommerce";
//        Assert.assertEquals(actual,expexted,"this is our facebook page");
//        System.out.println("this is our facebook page");
    }

    @When("user opens Twitter link")
    public void userOpensTwitterLink() {
        homeFollow.twitter().click();
    }

    @Then("Twitter is Opened in a new tab")
    public void twitterIsOpenedInANewTab() {
         homeFollow.assertTwitter();
        
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        homeFollow.rss().click();
    }

    @Then("rss is Opened in a new tab")
    public void rssIsOpenedInANewTab() {
         homeFollow.assertRss();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        homeFollow.youtube().click();

    }

    @Then("youtube is Opened in a new tab")
    public void youtubeIsOpenedInANewTab() {
         homeFollow.assertYoutube();
    }

}
