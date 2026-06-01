package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogPage extends ParentPage{

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Login']")
    public WebElement btnLogin;


    public void verifyTitleContainsText(String text) {
        Assert.assertTrue(GWD.getDriver().getTitle().toLowerCase().contains(text.toLowerCase()), "Login işleminde Hata.");
    }

    public void verifyTextEquals(WebElement e,String text) {
        Assert.assertEquals(e.getText(),text, "NewsLetter subscribe işleminde hata.");
    }

    public void verifyUrlContainsText(String text) {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(text), "Contuct us işlemined hata.");
    }

}
