package pages;

import static locator.HomeLocators.BUTTON_DOWNLOAD_APP_ANDROID;
import static locator.HomeLocators.BUTTON_DOWNLOAD_APP_IOS;
import static locator.HomeLocators.BUTTON_GET_RUPIAH_TOKEN;
import static locator.HomeLocators.BUTTON_GET_RUPIAH_TOKEN_FOR_PUPUP;

import base.WebPageObject;

public class HomePages extends WebPageObject {

  public void openPage() {
    openUrl("https://rupiahtoken.com/");
  }

  public void clickButtonGetRupiahToken() {
    click(BUTTON_GET_RUPIAH_TOKEN);
  }

  public void clickButtonGetRupiahForPopUp() {
    click(BUTTON_GET_RUPIAH_TOKEN_FOR_PUPUP);
    waitAbit(2);
  }

  public boolean isButtonDownloadAndroidDisplayed() {
    return find(BUTTON_DOWNLOAD_APP_ANDROID).isDisplayed();
  }

  public boolean isButtonDownloadIOSDisplayed() {
    return find(BUTTON_DOWNLOAD_APP_IOS).isDisplayed();
  }
}
