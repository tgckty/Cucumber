package StepDefinitions;

import Pages.DialogPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _01_LoginSteps {

    DialogPage dp=new DialogPage();
    @Given("Navigate to WebSite")
    public void navigateToWebSite() {
        // siteyi aç
        GWD.getDriver().get("https://opencart.abstracta.us/index.php?route=account/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        // kullanıcı adı şifre gönder, logine tıkla
        dp.mySendKeys(dp.username,"toktay@gmail.com");
        dp.mySendKeys(dp.password,"123123");
        dp.myClick(dp.btnLogin);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        // logini teyit et
        dp.wait.until(ExpectedConditions.titleContains("My Account"));
       dp.verifyTitleContainsText("My Account");

    }
}
