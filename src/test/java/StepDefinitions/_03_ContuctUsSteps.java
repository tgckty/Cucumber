package StepDefinitions;

import Pages.NavigatePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_ContuctUsSteps {
    NavigatePage np = new NavigatePage();

    @And("User navigates to the Contact Us page")
    public void userNavigatesToTheContactUsPage() {
        np.myClick(np.contuctUs);
    }

    @When("User enters a message with at least 10 characters")
    public void userEntersAMessageWithAtLeastCharacters(int arg0) {
        np.mySendKeys(np.enquiry, "mesajım budur benim.");
    }

    @And("User clicks the Submit button")
    public void userClicksTheSubmitButton() {
        np.myClick(np.submitBtn);
    }

    @Then("URL should contain {string}")
    public void urlShouldContain(String arg0) {
        np.verifyUrlContainsText("success");
    }
}
