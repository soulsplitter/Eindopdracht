package seleniumexercises.pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import seleniumexercises.helpers.SeleniumHelpers;

public class HotelFilterPage {

    private final WebDriver driver;
    private final SeleniumHelpers selenium;
    private final By oneStar = By.xpath("//div//label[@for='1']");
    private final By twoStars = By.xpath("//div//label[@for='2']");
    private final By threeStars = By.xpath("//div//label[@for='3']");
    private final By fourStars = By.xpath("//div//label[@for='4']");
    private final By fiveStars = By.xpath("//div//label[@for='5']");
    private final By setPercentageMin = By.xpath("//div[@class='box-content']//span[@class='irs-slider from']");
    private final By setPercentageMax = By.xpath("//div[@class='box-content']//span[@class='irs-slider to']");
    private final By viewMoreHotelAmenities = By.xpath("//span[contains(text(),'View More (+)')]");
    private final By airportTransport = By.xpath("//label[@for='Airport Transport']");
    private final By businessCenter = By.xpath("//label[@for='Business Center']");
    private final By disabledFacilities = By.xpath("//label[@for='Disabled Facilities']");
    private final By nightClub = By.xpath("//label[@for='Night Club']");
    private final By laundryService = By.xpath("//label[@for='Laundry Service']");
    private final By wifi = By.xpath("//label[@for='Wi-Fi Internet']");
    private final By barLounge = By.xpath("//label[@for='Bar Lounge']");
    private final By swimmingPool = By.xpath("//label[@for='Swimming Pool']");
    private final By insideParking = By.xpath("//label[@for='Inside Parking']");
    private final By shuttleBusService = By.xpath("//label[@for='Shuttle Bus Service']");
    private final By fitnessCenter = By.xpath("//label[@for='Fitness Center']");
    private final By spa = By.xpath("//label[@for='SPA']");
    private final By childrenActivities = By.xpath("//label[@for='Children Activities']");
    private final By airConditioner = By.xpath("//label[@for='Air Conditioner']");
    private final By banquetHall = By.xpath("//label[@for='Banquet Hall']");
    private final By cardsAccepted = By.xpath("//label[@for='Cards Accepted']");
    private final By elevator = By.xpath("//label[@for='Elevator']");
    private final By petsAllowed = By.xpath("//label[@for='Pets Allowed']");
    private final By restaurant = By.xpath("//label[@for='Restaurant']");
    private final By apartment = By.xpath("//label[@for='Apartment']");
    private final By hotel = By.xpath("//label[@for='Hotel']");
    private final By guestHouse = By.xpath("//label[@for='Guest House']");
    private final By motel = By.xpath("//label[@for='Motel']");
    private final By residence = By.xpath("//label[@for='Residence']");
    private final By resort = By.xpath("//label[@for='Resort']");
    private final By timeShare = By.xpath("//label[@for='Time Share']");
    private final By extendedStay = By.xpath("//label[@for='Extended Stay']");
    private final By villa = By.xpath("//label[@for='Villa']");
    private final By sortHighToLow = By.xpath("//label[@for='priceOrderDes']");
    private final By sortLowToHigh = By.xpath("//label[@for='priceOrderAsc']");
    private final By filterSearch = By.xpath("//button[@id='searchform']");


    private final By buttonAcceptCookies = By.xpath("//button[text()='Got it!']");

    public HotelFilterPage(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
    }

    public HotelFilterPage setStarsOneToFive(int stars) {
        switch (stars) {
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
        return this;
    }

    public HotelFilterPage setPercentageForMinimumPrice(int percentageMin) {
        WebElement priceSliderMin =
                driver.findElement(setPercentageMin);

        Assert.assertTrue(priceSliderMin.isDisplayed());

        Actions builder = new Actions(driver);
        builder.moveToElement(priceSliderMin)
                .click()
                .dragAndDropBy
                        (priceSliderMin, percentageMin, 0)
                .build()
                .perform();
        return this;
    }

    public HotelFilterPage setPercentageForMaximumPrice(int percentageMax) {
        WebElement priceSliderMax =
                driver.findElement(setPercentageMax);

        Assert.assertTrue(priceSliderMax.isDisplayed());

        Actions builder = new Actions(driver);
        builder.moveToElement(priceSliderMax)
                .click()
                .dragAndDropBy
                        (priceSliderMax, -percentageMax, 0)
                .build()
                .perform();
        return this;
    }

    //hieronder zitten alle amenities
    public HotelFilterPage clickViewMoreHotelAmenities() {
        selenium.click(viewMoreHotelAmenities);
        return this;
    }

    public HotelFilterPage clickSpa() {
        selenium.click(spa);
        return this;
    }

    public HotelFilterPage clickAirportTransport() {
        selenium.click(airportTransport);
        return this;
    }

    public HotelFilterPage clickBusinessCenter() {
        selenium.click(businessCenter);
        return this;
    }

    public HotelFilterPage clickDisabledFacilities() {
        selenium.click(disabledFacilities);
        return this;
    }

    public HotelFilterPage clickNightClub() {
        selenium.click(nightClub);
        return this;
    }

    public HotelFilterPage clickLaundryService() {
        selenium.click(laundryService);
        return this;
    }

    public HotelFilterPage clickRestaurant() {
        selenium.click(restaurant);
        return this;
    }

    public HotelFilterPage clickWiFi() {
        selenium.click(wifi);
        return this;
    }

    public HotelFilterPage clickBarLounge() {
        selenium.click(barLounge);
        return this;
    }

    public HotelFilterPage clickSwimmingPool() {
        selenium.click(swimmingPool);
        return this;
    }

    public HotelFilterPage clickInsideParking() {
        selenium.click(insideParking);
        return this;
    }

    public HotelFilterPage clickShuttleBusService() {
        selenium.click(shuttleBusService);
        return this;
    }

    public HotelFilterPage clickFitnessCenter() {
        selenium.click(fitnessCenter);
        return this;
    }

    public HotelFilterPage clickChildrenActivities() {
        selenium.click(childrenActivities);
        return this;
    }

    public HotelFilterPage clickAirConditioner() {
        selenium.click(airConditioner);
        return this;
    }

    public HotelFilterPage clickBanquetHall() {
        selenium.click(banquetHall);
        return this;
    }

    public HotelFilterPage clickCardsAccepted() {
        selenium.click(cardsAccepted);
        return this;
    }

    public HotelFilterPage clickElevator() {
        selenium.click(elevator);
        return this;
    }

    public HotelFilterPage clickPetsAllowed() {
        selenium.click(petsAllowed);
        return this;
    }

    //hieronder zitten alle property types
    public HotelFilterPage clickTypeApartment() {
        selenium.click(apartment);
        return this;
    }

    public HotelFilterPage clickTypeHotel() {
        selenium.click(hotel);
        return this;
    }

    public HotelFilterPage clickTypeGuestHouse() {
        selenium.click(guestHouse);
        return this;
    }

    public HotelFilterPage clickTypeMotel() {
        selenium.click(motel);
        return this;
    }

    public HotelFilterPage clickTypeResidence() {
        selenium.click(residence);
        return this;
    }

    public HotelFilterPage clickTypeResort() {
        selenium.click(resort);
        return this;
    }

    public HotelFilterPage clickTypeTimeShare() {
        selenium.click(timeShare);
        return this;
    }

    public HotelFilterPage clickTypeExtendedStay() {
        selenium.click(extendedStay);
        return this;
    }

    public HotelFilterPage clickTypeVilla() {
        selenium.click(villa);
        return this;
    }

    //Nu nog even sorteren van hoog naar laar of omgekeerd
    public HotelFilterPage clickSortHighToLow() {
        selenium.click(sortHighToLow);
        return this;
    }

    public HotelFilterPage clickSortLowToHigh() {
        selenium.click(sortLowToHigh);
        return this;
    }

    //en natuurlijk op SEARCH drukken
    public HotelFilterPage clickFilterSearch() {
        selenium.click(filterSearch);
        return this;
    }
}