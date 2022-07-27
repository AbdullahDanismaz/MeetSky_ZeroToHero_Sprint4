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
    public WebElement nameButton;


    @FindBy(xpath="//span[.='Size']")
     public WebElement sizeButton;


    @FindBy(xpath="//span[.='Modified']")
    public WebElement modifiedButton;


    @FindBy(xpath="//*[@id='view-toggle']")
    public WebElement toggleView;



    @FindBy(xpath= "//table[@class=\"list-container has-controls view-grid\"]/tbody//tr[1]")
    public WebElement folderView;





}




