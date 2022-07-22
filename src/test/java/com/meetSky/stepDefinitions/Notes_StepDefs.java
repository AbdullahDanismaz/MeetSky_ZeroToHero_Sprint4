package com.meetSky.stepDefinitions;

import com.meetSky.pages.NotePage;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
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

        notePage.noteArea.sendKeys("Mike");


    }
    @Then("verify that user created the note and its title matches with the first word")
    public void verify_that_user_created_the_note_and_its_title_matches_with_the_first_word() {

    }

    //-----------------------------------------------------------------------------------------


}
