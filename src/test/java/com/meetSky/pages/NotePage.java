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

    @FindBy(xpath = "//div[@class='ProseMirror']//p") //NoteArea
    public WebElement noteArea;

    @FindBy(xpath ="//div[@class='CodeMirror-code']") //NoteTitle
    public WebElement lastNotTitle;


    //------------------------------------------------

    @FindBy(xpath = "(//div[@class='app-navigation-entry__utils'])[7]")// leftNoteMenu
    public WebElement leftNoteMenu;

    @FindBy(xpath = "(//span[@class='action-button__text'])[2]") // addToFavorites
    public WebElement addToFavorites;


    //-------------------------------------------------
    @FindBy(xpath = "(//a[@aria-label='Files'])[1]") // headMainMenuFilesButton
    public WebElement headMainMenuFilesButton;

//    @FindBy(xpath = "")// favoritesButton

    //-------------------------------------------------

    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[7]") // rightNoteMenu
    public WebElement rightNoteMenu;

    @FindBy(xpath = "//span[text()='Preview']") // detailsButton
    public WebElement detailsButton;

    @FindBy(xpath = "//p[@class='app-sidebar-header__subtitle']") // detailsArea
    public WebElement detailsArea;

    //-------------------------------------------------

    @FindBy(xpath = "//input[@id='category']") // categoryNameInput
    public WebElement categoryNameInput;

    @FindBy(xpath = "(//input[@type='submit'])[3]") // enterButton
    public WebElement enterButton;

    @FindBy(xpath = "//span[@title='Categories']") // categoriesButton
    public WebElement categoriesButton;

//    @FindBy(xpath = "") // lastCategoryWebElement

    //-------------------------------------------------

//    @FindBy (xpath = "") // deleteNoteButton

    //------------------------------------------------




}
