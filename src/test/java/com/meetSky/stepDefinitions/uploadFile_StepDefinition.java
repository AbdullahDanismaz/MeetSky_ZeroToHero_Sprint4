package com.meetSky.stepDefinitions;

import com.meetSky.pages.UploadFile;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class uploadFile_StepDefinition {

UploadFile uploadFile = new UploadFile();

    @Given("Navigate and Click on the files folder")
    public void navigateAndClickOnTheFilesFolder() {
    }

    @Given("Navigate and Click plus link icon")
    public void navigate_and_click_plus_link_icon() {
        uploadFile.plusButton.click();

    }
    @When("Click Upload file list option")
    public void click_upload_file_list_option() {

    }
    @When("Select a test upload file")
    public void select_a_test_upload_file() {

    }
    @Then("Click Open button on pop up window")
    public void click_Open_button_on_pop_up_window() {

    }


}
