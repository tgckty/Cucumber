package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _08_EditAccountSteps {
    NavigatePage np = new NavigatePage();
    DialogPage dp = new DialogPage();

    @And("User navigates to the Edith Account page")
    public void userNavigatesToTheEdithAccountPage() {
        np.myClick(np.editAccount);
    }


    @When("User change {string} and {string} and click continue")
    public void userChangeAndAndClickContinue(String firstname, String lastname) {
        np.mySendKeys(dp.firstName, firstname);
        np.mySendKeys(dp.lastName, lastname);
        np.myClick(dp.cntBtn);
    }

    @Then("Account should successfully updated")
    public void accountShouldSuccessfullyUpdated() {
        dp.verifyTextEquals(dp.successMessage, "Success: Your account has been successfully updated.");
    }
}
