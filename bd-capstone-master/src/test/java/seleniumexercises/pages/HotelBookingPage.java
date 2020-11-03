package seleniumexercises.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import seleniumexercises.helpers.SeleniumHelpers;

public class HotelBookingPage {

    private final WebDriver driver;
    private final SeleniumHelpers selenium;
    private final By xPathHotelName = By.xpath("//div[@id='hotels']/div//a");
    private final By xPathCheckInDate = By.xpath("//input[@id='checkin']");
    private final By xPathCheckOutDate = By.xpath("//input[@id='checkout']");
    private final By xPathUpAdults = By.xpath("//div[@id='hotels']//div[@class='col o2']//button[contains(@class,'up')]");
    private final By xpathDownAdults = By.xpath("//div[@id='hotels']//div[@class='col o2']//button[contains(@class,'down')]");
    private final By xPathChildren = By.xpath("//div[@id='hotels']//div[@class='col 01']//button[contains(@class,'up')]");
    private final By xPathSearch = By.xpath("//div[@id='hotels']//button[@type='submit']");

    final String BASE_URL = "http://phptravels.net";

    private final By buttonAcceptCookies = By.xpath("//button[text()='Got it!']");

    public HotelBookingPage(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
    }

    public HotelBookingPage load() {
        driver.get(BASE_URL);
        selenium.click(buttonAcceptCookies);
        return this;
    }

    public HotelBookingPage selectMenuItem(String menuItem) {
        selenium.click(By.linkText(menuItem));
        return this;
    }
    public HotelBookingPage selectHotelOrCity(String HotelOrCity) {
        selenium.click(xPathHotelName);
        selenium.sendKeys(xPathHotelName, HotelOrCity);
        selenium.click(By.xpath("//div/span[@class='select2-match']"));
        return this;
    }
    public HotelBookingPage setAdults(int amount){
        int i = 2;
               if (amount != 1){
            do {
                selenium.click(xPathUpAdults);
                i++;

                }
            while ( i < amount);}

        else selenium.click(xpathDownAdults);
        return this;
    }
    public HotelBookingPage setChildren (int children){
        int o = 0;
        do {
            selenium.click(xPathChildren);
            o++;

        }
        while ( o < children);
    return this;}

    public HotelBookingPage setCheckInDate(int day, int month, int year){
        String checkInDate = String.format("%d/%d/%d", day, month, year);
        selenium.click(xPathCheckInDate);
        selenium.sendKeys(xPathCheckInDate, (Keys.CONTROL + "a"));
        selenium.hitKeys(xPathCheckInDate, (Keys.BACK_SPACE));
        selenium.sendKeys(xPathCheckInDate, checkInDate);
        return this;
    }
    public HotelBookingPage setTheCheckOutDate(int day, int month, int year){
        String checkOutDate = String.format("%d/%d/%d", day, month, year);
        selenium.click(xPathCheckOutDate);
        selenium.sendKeys(xPathCheckOutDate, (Keys.CONTROL + "a"));
        selenium.hitKeys(xPathCheckOutDate, (Keys.BACK_SPACE));
        selenium.sendKeys(xPathCheckOutDate, checkOutDate);
        return this;
    }
    public HotelBookingPage hitSearch(){
        selenium.click(xPathSearch);
        return this;
    }
    }