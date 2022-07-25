package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {
    public ProfileSettingsPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//img[@width='32']")
    public WebElement AvatarForProfileSettings;

    @FindBy(xpath = "//a[@href='/index.php/settings/user']")
    public WebElement Settings;

    @FindBy(id = "displayname")
    public WebElement FullNamePlaceHolder;

    @FindBy(css = "#phoneform .icon-password span")
    public WebElement DropdownByPhoneNumber;

    @FindBy(id = "localeexample-time")
    public WebElement localTim;


    
    
    
    
    
    
   









    
}
