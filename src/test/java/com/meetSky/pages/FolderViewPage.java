package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FolderViewPage {

    public FolderViewPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='sort-indicator icon-triangle-s']")
    public WebElement tringleNameS;

    @FindBy(xpath = "//*[@class='sort-indicator icon-triangle-n']")
    public WebElement tringleNameN;


    @FindBy(xpath="//span[.='Size']")
     public WebElement sizeButton;


    @FindBy(xpath="//span[.='Modified']")
    public WebElement modifiedButton;


    @FindBy(xpath="//label[@class=\"button icon-toggle-filelist\"]")
    public WebElement toggleFileList;


    @FindBy(xpath="//label[@class=\"button icon-toggle-pictures\"]")
    public WebElement togglePictures;

// Here I have find the first folder from the firs row
    @FindBy(xpath= "//table[@class=\"list-container has-controls view-grid\"]/tbody//tr[1]")
    public WebElement folderView;



    @FindBy(xpath="//label[@for=\"select_all_files\"]")
    public WebElement selectAllCheckBox;




}




