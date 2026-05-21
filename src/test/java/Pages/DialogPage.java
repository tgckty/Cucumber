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


    //kendi sendKeys metodumuzu yazacağız.
//    mySendKeys(locator,"username"){
//    scroll
//    gözükene kadar bekle
//    clear
//    sendKeys
//    }




}
