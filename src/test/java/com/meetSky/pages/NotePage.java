package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotePage {
    public NotePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains(@aria-label,'Notes')])[1]") // NoteButton
    public WebElement noteButton;

    @FindBy(xpath = "//button[@id='notes_new_note']") //NewNoteButton
    public WebElement newNoteButton;

    @FindBy(xpath = "//div[@class=\'CodeMirror cm-s-easymde CodeMirror-wrap\']") //NoteArea
    public WebElement noteArea;

    @FindBy(xpath ="//div[@class='CodeMirror-code']") //NoteTitle
    public WebElement lastNotTitle;


    //------------------------------------------------
    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[3]")// leftNoteMenu
    public WebElement leftNoteMenu;

    @FindBy(xpath = "(//span[@class='action-button__text'])[2]") // addToFavorites
    public WebElement addToFavorites;

 /*
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
