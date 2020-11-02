package seleniumexercises.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import seleniumexercises.helpers.SeleniumHelpers;

public class HotelFilterPage {

    private WebDriver driver;
    private SeleniumHelpers selenium;
    private By oneStar = By.xpath("//div//label[@for='1']");
    private By twoStars = By.xpath("//div//label[@for='2']");
    private By threeStars = By.xpath("//div//label[@for='3']");
    private By fourStars = By.xpath("//div//label[@for='4']");
    private By fiveStars = By.xpath("//div//label[@for='5']");
    private By setPercentageMin = By.xpath("");
    private By setPercentageMax = By.xpath("");

    final String BASE_URL = "https://phptravels.net/hotels/search/";

    private By buttonAcceptCookies = By.xpath("//button[text()='Got it!']");

    public HotelFilterPage(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
    }
public HotelFilterPage setStarsOneToFive(int stars){
switch(stars){
    case 1 -> {
        selenium.click(oneStar);
    }
    case 2 -> {
        selenium.click(twoStars);
    }
    case 3 -> {
        selenium.click(threeStars);
    }
    case 4 -> {
        selenium.click(fourStars);
    }
    case 5 -> {
        selenium.click(fiveStars);
    }
}
   return this; }

   public HotelFilterPage setPercentageForMinimumPrice(int price) {
       double percentage = (price - 15)/12.95232;

    return this;
   }
    public HotelFilterPage setPercentageForMaximumPrice(int price) {
        double percentage = (price - 15)/12.95232;

        return this;
    }
    }