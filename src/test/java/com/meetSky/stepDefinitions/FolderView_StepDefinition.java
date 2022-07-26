package com.meetSky.stepDefinitions;

import com.meetSky.pages.FolderViewPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class FolderView_StepDefinition {
    FolderViewPage folderViewPage = new FolderViewPage();

    @When("Click on the Name button.")
    public void clickOnTheNameButton() {
        folderViewPage.nameButton.click();
    }

    @Then("User should see order by Name")
    public void userShouldSeeOrderByName() {

    }
}
