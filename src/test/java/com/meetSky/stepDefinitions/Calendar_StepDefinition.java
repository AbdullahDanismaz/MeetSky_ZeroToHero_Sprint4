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

    @Then("click on the calendar icon on the home page")
    public void click_on_the_calendar_icon_on_the_home_page() {
        page.calendarIcon.click();
    }


    @And("click on the menu toggle icon on calendar page")
   public void clickOnTheMenuToggleIconOnCalendarPage() {
//      page.calendarMenu.click();
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(2);
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//pre)[2]"))).click().sendKeys(expectedText).perform();


    }

}
