package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile {
    public UploadFile(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='icon icon-add']")
    public WebElement plusButton;
}
