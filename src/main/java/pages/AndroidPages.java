package pages;

import base.AndroidPageObject;
import io.appium.java_client.MobileBy;

public class AndroidPages extends AndroidPageObject {

  public void inputEmail(String email) {
    type(MobileBy.id("textInputEditTextEmail"), email);
  }

  public void inputPassword(String password) {
    type(MobileBy.id("textInputEditTextPassword"), password);
  }

  public void clickButtonLogin() {
    click(MobileBy.id("appCompatButtonLogin"));
  }

  public String getDataEmail() {
    return getText(MobileBy.id("textViewEmail"));
  }

  public void clickButtonCreateOne() {
    click(MobileBy.id("textViewLinkRegister"));
  }

  public void inputName(String name) {
    type(MobileBy.id("textInputEditTextName"), name);
  }

  public void inputRePassword(String rePassword) {
    type(MobileBy.id("textInputEditTextConfirmPassword"), rePassword);
  }

  public void clickButtonRegister() {
    click(MobileBy.id("appCompatButtonRegister"));
  }

  public void clickLinkLogin() {
    getDriver().findElementByAndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
            + "login" + "\").instance(0))").click();
  }
}
