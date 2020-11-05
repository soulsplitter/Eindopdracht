package seleniumexercises.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import seleniumexercises.helpers.SeleniumHelpers;

public class HotelBookARoomPage {

    private final WebDriver driver;
    private final SeleniumHelpers selenium;
    private final By clickSelectRoom = By.xpath("//div[@class='custom-control custom-checkbox']/input[@value='17']");


    final String BASE_URL = "http://phptravels.net";

    private final By buttonAcceptCookies = By.xpath("//button[text()='Got it!']");

    public HotelBookARoomPage(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
    }

    public HotelBookARoomPage load() {
        driver.get(BASE_URL);
        selenium.click(buttonAcceptCookies);
        return this;
    }
    public HotelBookARoomPage clickSelectRoom(){
        selenium.click(clickSelectRoom);
        return this;
    }
    }