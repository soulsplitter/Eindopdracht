package seleniumexercises.helpers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SeleniumHelpers {

    private WebDriver driver;

    public SeleniumHelpers(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By by) {

        try {
            new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).click();
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in click(): %s", te.getMessage()));
        }
    }

    public void sendKeys(By by, String textToType) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).sendKeys(textToType);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in sendKeys(): %s", te.getMessage()));
        }
    }
    public void hitKeys(By by, Keys textToType) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).sendKeys(textToType);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in sendKeys(): %s", te.getMessage()));
        }
    }
    public boolean isDisplayed(By by) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }
        catch (TimeoutException te) {
            return false;
        }
    }
    public void dropItDown(By by, String selectText) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
            Select dropDown = new Select(driver.findElement(by));
            dropDown.selectByVisibleText(selectText);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in dropDown(): %s", te.getMessage()));
        }
    }
    public void select(By by, String valueToSelect) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
            new Select(driver.findElement(by)).selectByVisibleText(valueToSelect);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in select(): %s", by.toString()));
        }
    }

    public void selectWithWait(By by, String valueToSelect) {

        try {
            new WebDriverWait(driver, 10).
                    until(ExpectedConditions.presenceOfNestedElementLocatedBy(by, By.xpath("//option[text()='"+ valueToSelect +"']")));
            new Select(driver.findElement(by)).selectByVisibleText(valueToSelect);
        }
        catch (TimeoutException te) {
            Assert.fail(String.format("Exception in selectWithWait(): %s", te.getMessage()));
        }
    }
    public String getElementText(By by) {

        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by));
            return driver.findElement(by).getText();
        } catch (TimeoutException te) {
            return "Element not found";
        }
    }

    public void WatchFromDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        driver.findElement(By.name("date")).sendKeys(dtf.format(localDate));
    }
    }

