package base;

import driver.AndroidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class AndroidPageObject {

  public AndroidDriver<AndroidElement> getDriver() {
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By locator) {
    return getDriver().findElement(locator);
  }

  public void click(By locator) {
    find(locator).click();
  }

  public void type(By locator, String text) {
    AndroidElement element = find(locator);
    element.clear();
    element.sendKeys(text);
  }

  public String getText(By locator) {
    return find(locator).getText();
  }

  //kembangin class ini lebih

}
