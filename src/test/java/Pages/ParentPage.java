package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    public ParentPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    public void mySendKeys(WebElement e, String text) {

        wait.until(ExpectedConditions.visibilityOf(e)); // metoda gönderilen element görünene kadar bekle
        scrollToElement(e); // gönderdiğimiz elemeana kadar sayfayı kaydır
        e.clear(); // elementteki veriyi temizle
        e.sendKeys(text); // metoda gönderdiğimiz stringi yazdır
    }

    public void myClick(WebElement e) {
        wait.until(ExpectedConditions.visibilityOf(e));
        scrollToElement(e);
        e.click();
    }

    public void scrollToElement(WebElement e) {

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", e);
    }

    public void verifyTitleContainsText(String text) {
        Assert.assertTrue(GWD.getDriver().getTitle().toLowerCase().contains(text.toLowerCase()), "Login işleminde Hata.");
    }

    public void verifyTextEquals(WebElement e,String text) {
        Assert.assertEquals(e.getText(),text, "İşlemde hata.");
    }

    public void verifyUrlContainsText(String text) {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(text), "İşlemde hata.");
    }

}
