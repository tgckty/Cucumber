package StepDefinitions;

import Pages.DialogPage;
import Pages.NavigatePage;
import Utilities.ExcelUtility;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

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

    @When("User update EditAccount from Excel")
    public void userUpdateEditAccountFromExcel() {
        List<List<String>> tablo= ExcelUtility.getData(
                "src/test/java/ApachePOI/Resource/EditAccount.xlsx",
                "editAccount",
                2
        );

        for(List<String> satir : tablo)
        {
            np.myClick(np.editAccount);
            dp.mySendKeys(dp.firstName, satir.get(0));
            dp.mySendKeys(dp.lastName, satir.get(1));
            dp.myClick(dp.cntBtn);
            dp.SuccessMessageValidation();
        }
    }
}
