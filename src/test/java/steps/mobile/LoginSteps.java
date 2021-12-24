package steps.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AndroidPages;

public class LoginSteps {

  AndroidPages androidPages = new AndroidPages();
  private String expectedEmail;

  @Given("user is on login page")
  public void userIsOnLoginPage() {
  }

  @When("user input email {string}")
  public void userInputEmail(String email) {
    expectedEmail = email;
    androidPages.inputEmail(email);
  }

  @When("user input password {string}")
  public void userInputPassword(String password) {
    androidPages.inputPassword(password);
  }

  @Then("user should successfully login")
  public void userShouldSuccessfullyLogin() {
    Assert.assertEquals(expectedEmail, androidPages.getDataEmail());
  }

  @When("user click button login")
  public void userClickButtonLogin() {
    androidPages.clickButtonLogin();
  }

  @When("user click button create one")
  public void userClickButtonCreateOne() {
    androidPages.clickButtonCreateOne();
  }

  @When("user input name {string}")
  public void userInputName(String name) {
    androidPages.inputName(name);
  }

  @When("user input confirm password {string}")
  public void userInputConfirmPassword(String password) {
    androidPages.inputRePassword(password);
  }

  @When("user click link login")
  public void userClickLinkLogin() {
    androidPages.clickLinkLogin();
  }

  @When("user click button register")
  public void userClickButtonRegister() {
    androidPages.clickButtonRegister();
  }
}
