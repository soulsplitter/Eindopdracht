package seleniumexercises.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumexercises.helpers.SeleniumHelpers;

public class rentABoatPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;

    private By dropdownToCountry = By.xpath("//div[@id='boats']//a[@class='select2-choice select2-default']");
    private By textfieldToCountry = By.xpath("//ul[@class='select2-results']//div[text()='United Arab Emirates, Dubai']");
    private By dropdownBoatType = By.xpath("//div[@id='boattype_chosen']");
    private By textfieldDate = By.name("Checkin");
    private By buttonSubmit = By.xpath("//button[text()='Submit']");

    public rentABoatPage(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
    }

    public rentABoatPage setCountryOfRentTo(String countryOfRent) throws InterruptedException {

        selenium.click(dropdownToCountry);
        Thread.sleep(5000);
        selenium.click(textfieldToCountry);
        //selenium.click(By.xpath("//ul[@class='select2-results']//div[text()='United Arab Emirates, Dubai']"));
        return this;
    }
    public rentABoatPage setBoatType(String typeOfBoat) throws InterruptedException {

        selenium.click(dropdownBoatType);
        //selenium.sendKeys(dropdownBoatType, typeOfBoat);
        selenium.click(By.xpath(String.format("//li[contains(text(),'%s')]", typeOfBoat)));
        Thread.sleep(5000);
        return this;
    }

    public rentABoatPage setDateTo(String checkinDate) {
        selenium.click(textfieldDate);
        selenium.sendKeys(textfieldDate, checkinDate);
        selenium.click(By.xpath("//input[@id='']"));
        return this;
    }

}

