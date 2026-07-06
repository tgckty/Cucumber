package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigatePage extends ParentPage {

    @FindBy(linkText = "Newsletter")
    public WebElement newsletter;

    @FindBy(linkText = "Contact Us")
    public WebElement contuctUs;

    @FindBy(linkText = "Edit Account")
    public WebElement editAccount;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "Newsletter":
                return this.newsletter;
            case "ContactUs":
                return this.contuctUs;
            case "EditAccount":
                return this.editAccount;
            default:
                return null;
        }
    }

}
