package com.meetSky.stepDefinitions;

import com.meetSky.pages.ProfileSettingsPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProfileSettings_Stepdefs {
ProfileSettingsPage page = new ProfileSettingsPage();

    @Given("Click on Profile Settings")
    public void click_on_profile_settings() {

        BrowserUtils.sleep(3);
       page.AvatarForProfileSettings.click();
    }
    @Given("Click on Settings")
    public void click_on_settings() {
        BrowserUtils.sleep(3);
        page.Settings.click();

    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        BrowserUtils.sleep(3);
        String actualName = page.FullNameInput.getText();
        Assert.assertEquals(actualName, string);

    }


    @Then("Verify EMAIL is visible")
    public void verifyEMAILIsVisible() {
        page.emailInput.getText();
        Assert.assertTrue(page.emailInput.isDisplayed());
    }
}













