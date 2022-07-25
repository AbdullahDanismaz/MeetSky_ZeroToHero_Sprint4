package com.meetSky.stepDefinitions;

import com.meetSky.pages.NotePage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Notes_StepDefs {

    NotePage notePage = new NotePage();

    @Then("user click the pencil button on the top menu")
    public void user_click_the_pencil_button_on_the_top_menu() {
        notePage.noteButton.click();

    }

    @Then("user click the New note button on the left menu")
    public void user_click_the_new_note_button_on_the_left_menu() {

        notePage.newNoteButton.click();
    }

    @Then("user write notes inside note page")
    public void user_write_notes_inside_note_page() {
//        BrowserUtils.waitForClickablility(notePage.noteArea,90);
        notePage.noteArea.click();
        notePage.noteArea.sendKeys("Mike");


    }

    @Then("verify that user created the note and its title matches with the first word")
    public void verify_that_user_created_the_note_and_its_title_matches_with_the_first_word() {

    }

    //-----------------------------------------------------------------------------------------

    @When("user click one note three dot menu link")
    public void user_click_one_note_three_dot_menu_link() {
        notePage.leftNoteMenu.click();

    }

    @When("user click to Add to favorites inside the opened menu")
    public void user_click_to_add_to_favorites_inside_the_opened_menu() {
        notePage.leftNoteMenu.click();
    }

    @When("user click Files button on the head menu")
    public void user_click_files_button_on_the_head_menu() {
        notePage.addToFavorites.click();
    }

    @When("user click to Favorites on the left menu")
    public void user_click_to_favorites_on_the_left_menu() {

    }

    @Then("verify that favorite note inside the favorites")
    public void verify_that_favorite_note_inside_the_favorites() {

    }
}
