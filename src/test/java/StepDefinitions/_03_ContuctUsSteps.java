package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_ContuctUsSteps {
    NavigatePage np = new NavigatePage();
    DialogPage dp=new DialogPage();
    @And("User navigates to the Contact Us page")
    public void userNavigatesToTheContactUsPage() {
        np.myClick(np.contuctUs);
    }

    @When("User enters a message with at least 10 characters")
    public void userEntersAMessageWithAtLeastCharacters() {
        np.mySendKeys(np.enquiry, "mesajım budur benim.");
    }

    @And("User clicks the Submit button")
    public void userClicksTheSubmitButton() {
        np.myClick(np.submitBtn);
    }

    @Then("URL should contain success")
    public void urlShouldContain() {
        dp.verifyUrlContainsText("success");
    }

    @When("Send a message as {string} and click to Submit")
    public void sendAMessageAsAndClickToSubmit(String mesaj) {
        np.mySendKeys(np.enquiry, mesaj);
        np.myClick(np.submitBtn);
    }
}
