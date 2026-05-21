package StepDefinitions;

import Pages.NavigatePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_NewsLetterSteps {

    NavigatePage np = new NavigatePage();

    @And("Navigate to NewsLetter")
    public void navigateToNewsLetter() {
        np.myClick(np.newsletter);
    }

    @When("Click to Yes")
    public void clickToYes() {
        np.myClick(np.yesRadioBtn);
        np.myClick(np.cntBtn);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        np.verifyTextEquals(np.successMessage,"Success: Your newsletter subscription has been successfully updated!");
    }
}
