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
        np.myClick(dp.yesRadioBtn);
        np.myClick(dp.cntBtn);
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed(String text) {
        dp.verifyTextEquals(dp.successMessage,text);
    }

    @When("Click to No")
    public void clickToNo() {
        np.myClick(dp.noRadioBtn);
        np.myClick(dp.cntBtn);
    }

    @When("Check to unchecked option")
    public void checkToUncheckedOption() {
       if(dp.yesRadioBtn.isSelected())
           np.myClick(dp.noRadioBtn);
       else
           np.myClick(dp.yesRadioBtn);

       np.myClick(dp.cntBtn);
    }
}
