package steps.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePages;
import pages.RegisterPages;

public class RegisterSteps {

  HomePages homePages = new HomePages();
  RegisterPages registerPages = new RegisterPages();

  @Given("user open {string} page")
  public void userOpenPage(String page) {
    homePages.openPage();
  }

  @When("user click on the button get rupiah token on the buttom page")
  public void userClickOnTheButtonGetRupiahTokenOnTheButtomPage() {
    homePages.clickButtonGetRupiahForPopUp();
  }

  @Then("user can see information to get rupiah token")
  public void userCanSeeInformationToGetRupiahToken() {
    Assert.assertTrue(registerPages.isButtonDownloadPintuDisplayed());
    Assert.assertTrue(registerPages.isButtonContactCustomerSupportDisplayed());
  }

  @When("user click on the button get rupiah token from menu")
  public void userClickOnTheButtonGetRupiahTokenFromMenu() {
    homePages.clickButtonGetRupiahToken();
  }

  @Then("user can see popup information to download app")
  public void userCanSeePopupInformationToDownloadApp() {
    Assert.assertTrue(homePages.isButtonDownloadAndroidDisplayed());
    Assert.assertTrue(homePages.isButtonDownloadIOSDisplayed());
  }
}
