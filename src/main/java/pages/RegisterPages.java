package pages;

import static locator.RegisterLocator.BUTTON_CONTACT_CUSTOMER_SUPPORT;
import static locator.RegisterLocator.BUTTON_DOWNLOAD_PINTU;

import base.WebPageObject;

public class RegisterPages extends WebPageObject {

  public boolean isButtonDownloadPintuDisplayed() {
    return find(BUTTON_DOWNLOAD_PINTU).isDisplayed();
  }

  public boolean isButtonContactCustomerSupportDisplayed(){
    return find(BUTTON_CONTACT_CUSTOMER_SUPPORT).isDisplayed();
  }
}
