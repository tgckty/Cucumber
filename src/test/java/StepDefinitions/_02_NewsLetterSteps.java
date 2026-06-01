package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_NewsLetterSteps {

    NavigatePage np = new NavigatePage();
    DialogPage dp=new DialogPage();
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
        dp.verifyTextEquals(np.successMessage,"Success: Your newsletter subscription has been successfully updated!");
    }

    @When("Click to No")
    public void clickToNo() {
        np.myClick(np.noRadioBtn);
        np.myClick(np.cntBtn);
    }

    @When("Checked to unchecked option")
    public void checkedToUncheckedOption() {
       if(np.yesRadioBtn.isSelected())
           np.myClick(np.noRadioBtn);
       else
           np.myClick(np.yesRadioBtn);

       np.myClick(np.cntBtn);
    }
}
