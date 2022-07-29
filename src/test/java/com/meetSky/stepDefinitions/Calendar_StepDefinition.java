package com.meetSky.stepDefinitions;

import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.meetSky.pages.BasePage;

public class Calendar_StepDefinition {

    BasePage page=new BasePage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("click on the calendar icon on the home page")
    public void click_on_the_calendar_icon_on_the_home_page() {
        page.calendarIcon.click();
    }


    @And("click on the menu toggle icon on calendar page")
   public void clickOnTheMenuToggleIconOnCalendarPage() {
        BrowserUtils.waitFor(2);
        page.calendarToggleMenu.click();
        //actions.moveToElement(Driver.getDriver().findElement(By.xpath("//button[@class='icon action-item__menutoggle icon-view-module']"))).click().perform();

    }


    @Then("User can click day button on calendar menu")
    public void userCanClickDayButtonOnCalendarMenu() {
        page.dayCalendarMenu.click();
    }

    @Then("User can click week button on calendar menu")
    public void userCanClickWeekButtonOnCalendarMenu() {
        page.weekCalendarMenu.click();
    }

    @Then("User can click month button on calendar menu")
    public void userCanClickMonthButtonOnCalendarMenu() {
        page.monthCalendarMenu.click();
    }
}
