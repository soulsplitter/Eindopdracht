package seleniumexercises.pages;

import seleniumexercises.helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VisaApplicationPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;

    private By textfieldFirstName = By.name("first_name");
    private By textfieldLastName = By.name("last_name");
    private By textfieldEmail = By.name("email");
    private By textfieldConfirmEmail = By.name("confirmemail");
    private By textfieldContactNumber = By.name("phone");
    private By ButtonSubmit2 = By.xpath("//button[@id='sub']");
    //private By reservationNumber = By.xpath("//strong[contains(text(),'%s')]");

    public VisaApplicationPage(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
    }

    public VisaApplicationPage setFirstName(String firstName) {

        selenium.sendKeys(textfieldFirstName, firstName);
        return this;
    }
    public VisaApplicationPage setLastName(String lastName) {

        selenium.sendKeys(textfieldLastName, lastName);
        return this;
    }
    public VisaApplicationPage setEmail(String eMail) {

        selenium.sendKeys(textfieldEmail, eMail);
        return this;
    }
    public VisaApplicationPage setConfirmEmail(String ConfirmEmail) {

        selenium.sendKeys(textfieldConfirmEmail, ConfirmEmail);
        return this;
    }

    public VisaApplicationPage setContactNumber (String contactNumber) {

        selenium.sendKeys(textfieldContactNumber, contactNumber);
        return this;
    }
    public VisaApplicationPage submitSearch2(String SearchSubmit2) {
        selenium.click(ButtonSubmit2);
        return this;
    }




}