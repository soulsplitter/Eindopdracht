package seleniumexercises.pages;

import seleniumexercises.helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VisaApplicationPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;

    private By textfieldFirstName = By.name("first_name");

    public VisaApplicationPage(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
    }

    public VisaApplicationPage setFirstName(String firstName) {

        selenium.sendKeys(textfieldFirstName, firstName);
        return this;
    }
}