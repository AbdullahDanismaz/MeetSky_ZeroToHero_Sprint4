package com.meetSky.stepDefinitions;

import com.meetSky.pages.FolderViewPage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class FolderView_StepDefinition {
    FolderViewPage folderViewPage = new FolderViewPage();

    @When("Click on the Name button.")
    public void clickOnTheNameButton() {
        folderViewPage.nameButton.click();
    }

    @Then("User should see order by Name")
    public void userShouldSeeOrderByName() {
    }


    @When("Click on the Size button.")
    public void click_on_the_size_button() {
        folderViewPage.sizeButton.click();

    }


    @Then("User should see order by Size")
    public void user_should_see_order_by_size() {

    }


    @When("Click on the Modified button.")
    public void click_on_the_modified_button() {
        folderViewPage.modifiedButton.click();
    }


    @Then("User should see order by Modified")
    public void user_should_see_order_by_modified() {

    }


    @When("Click the toggle-view button at the right corner of all files tab screen.")
    public void click_the_toggle_view_button_at_the_right_corner_of_all_files_tab_screen() {
        folderViewPage.toggleFileList.click();
    }


    @Then("User should see the  toggle-view .")
    public void user_should_see_the_toggle_view() {

    }


    @When("Click on the “select all” checkbox at the left top corner of the list.")
    public void click_on_the_select_all_checkbox_at_the_left_top_corner_of_the_list() {
    folderViewPage.selectAllCheckBox.click();
    }


    @Then("User should see the total values of all files in the first line .")
    public void user_should_see_the_total_values_of_all_files_in_the_first_line() {
    Assert.assertTrue(folderViewPage.selectAllCheckBox.isDisplayed());
    }


}
