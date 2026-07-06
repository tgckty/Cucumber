package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;


public class DialogPage extends ParentPage {

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Login']")
    public WebElement btnLogin;

    @FindBy(id = "input-enquiry")
    public WebElement enquiry;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitBtn;

    @FindBy(name = "firstname")
    public WebElement firstName;

    @FindBy(name = "lastname")
    public WebElement lastName;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement yesRadioBtn;

    @FindBy(xpath = "//input[@value='0']")
    public WebElement noRadioBtn;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement cntBtn;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successMessage;

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(css = "[class='btn btn-default btn-lg']")
    public WebElement srcBtn;

    @FindBy(css = "[class='caption'] a")
    public List<WebElement> srcNameList;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "inputFirstname":
                return this.firstName;
            case "inputLastname":
                return this.lastName;
            case "cntBtn":
                return this.cntBtn;
            case "enquiryArea":
                return this.enquiry;
            case "submitBtn":
                return this.submitBtn;
            case "yesRadioButton":
                return this.yesRadioBtn;
            case "noRadioButton":
                return this.noRadioBtn;
            case "searchBox":
                return this.searchBox;
            case "srcBtn":
                return this.srcBtn;
            default:
                return null;
        }
    }

    public void verifyTitleContainsText(String text) {
        Assert.assertTrue(GWD.getDriver().getTitle().toLowerCase().contains(text.toLowerCase()), "Login işleminde Hata.");
    }

    public void verifyTextEquals(WebElement e, String text) {
        Assert.assertEquals(e.getText(), text, "HATA");
    }

    public void verifyUrlContainsText(String text) {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(text), "Beklenen değer bulunamadı.");
    }

    public void SuccessMessageValidation() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("success"));
    }
}
