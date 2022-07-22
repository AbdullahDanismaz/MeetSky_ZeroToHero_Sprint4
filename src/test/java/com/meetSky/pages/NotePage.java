package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotePage {
    public NotePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
/*
    @FindBy(xpath = "(//a[contains(@aria-label,'Notes')])[1]") // NoteButton

    @FindBy(xpath = "//button[@id='notes_new_note']") //NewNoteButton

    @FindBy(xpath = "//div[@class='CodeMirror-scroll']") //NoteArea

    @FindBy(xpath =) //NoteTitle
    //------------------------------------------------
    @FindBy(xpath = "")// leftNoteMenu

    @FindBy(xpath = "") // addToFavorites

    //-------------------------------------------------
    @FindBy(xpath = "") // headMainMenuFilesButton

    @FindBy(xpath = "")// favoritesButton
    //-------------------------------------------------

    @FindBy(xpath = "") // rightNoteMenu

    @FindBy(xpath = "") // detailsButton

    @FindBy(xpath = "") // detailsArea

    //-------------------------------------------------

    @FindBy(xpath = "") // categoryNameInput

    @FindBy(xpath = "") // enterButton

    @FindBy(xpath = "") // categoriesButton

    @FindBy(xpath = "") // lastCategoryWebElement

    //-------------------------------------------------

    @FindBy (xpath = "") // deleteNoteButton

    //------------------------------------------------

*/


}
