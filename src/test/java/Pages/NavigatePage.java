package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigatePage extends ParentPage{

    @FindBy(linkText = "Newsletter")
    public WebElement newsletter;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement yesRadioBtn;

    @FindBy(xpath = "//input[@value='0']")
    public WebElement noRadioBtn;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement cntBtn;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successMessage;

    @FindBy(linkText = "Contact Us")
    public WebElement contuctUs;

    @FindBy(id = "input-enquiry")
    public WebElement enquiry;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitBtn;


}
