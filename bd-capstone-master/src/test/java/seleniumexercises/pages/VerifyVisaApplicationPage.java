package seleniumexercises.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumexercises.helpers.SeleniumHelpers;

public class VerifyVisaApplicationPage {

    private SeleniumHelpers selenium;
    private By buttonViewInvoice = By.xpath("//a[contains(text(),'View Invoice')]");

    public VerifyVisaApplicationPage(WebDriver driver) {

       try {


            WebElement visaSucces = driver.findElement(By.xpath("//strong[contains(text(),'Visa Submitted')]"));
            junit.framework.Assert.assertTrue(visaSucces.isDisplayed());
            System.out.println("Visa is succesfully submitted");
        }catch (Exception ex) {
            System.out.println("Error with submitting the Visa");
            junit.framework.Assert.fail();
        }
    }

    public VerifyVisaApplicationPage viewInvoice(String InvoiceView) {
        selenium.click(buttonViewInvoice);
        return this;

    }

}



