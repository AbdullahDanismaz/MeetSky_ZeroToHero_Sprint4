package com.meetSky.stepDefinitions;

import com.meetSky.pages.CalendarPage;
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


    CalendarPage page = new CalendarPage();


    //Actions actions = new Actions(Driver.getDriver());

    @Then("click on the calendar icon on the home page")
    public void click_on_the_calendar_icon_on_the_home_page() {
        page.calendarIcon.click();
    }


    @And("click on the menu toggle icon on calendar page")
   public void clickOnTheMenuToggleIconOnCalendarPage() {

        BrowserUtils.waitFor(5);
        page.calendarToggleMenu.click();
        //actions.moveToElement(Driver.getDriver().findElement(By.xpath("//button[@class='icon action-item__menutoggle icon-view-module']"))).click().perform();
    }


    @Then("User can click day button on calendar menu")
    public void userCanClickDayButtonOnCalendarMenu() {
        page.dayCalendarMenu.click();
    }

    @Then("User can click week button on calendar menu")
    public void userCanClickWeekButtonOnCalendarMenu() {
        BrowserUtils.waitFor(5);
        page.weekCalendarMenu.click();
    }

    @Then("User can click month button on calendar menu")
    public void userCanClickMonthButtonOnCalendarMenu() {
        BrowserUtils.waitFor(5);
        page.monthCalendarMenu.click();
    }

    @And("User can create a new event on calendar page")
    public void userCanCreateANewEventOnCalendarPage(){
        BrowserUtils.waitFor(5);
        page.createNewEvent.click();
    }

    @Then("user can delete an event on calendar page")
    public void userCanDeleteAnEventOnCalendarPage() {
        BrowserUtils.waitFor(5);
        page.deleteEventButton.click();
    }

    @And("User should click save button")
    public void userShouldClickSaveButton() {
        BrowserUtils.waitFor(5);
        page.saveButton.click();
    }

    @Then("user need to choose untitled event on calendar")
    public void userNeedToChooseUntitledEventOnCalendar() {
        BrowserUtils.waitFor(5);
        page.untitledEventMessage.click();
    }

    @And("user should click dots on event page")
    public void userShouldClickDotsOnEventPage() {
        BrowserUtils.waitFor(5);
        page.dotsButton.click();
    }
}
