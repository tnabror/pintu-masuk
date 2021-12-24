package locator;

import org.openqa.selenium.By;

public interface HomeLocators {

  By BUTTON_GET_RUPIAH_TOKEN = By.xpath("//a[contains(text(),'Get Rupiah Token')]");
  By BUTTON_GET_RUPIAH_TOKEN_FOR_PUPUP = By
      .xpath("//p/following-sibling::button[text()='Get Rupiah Token']");
  By BUTTON_DOWNLOAD_APP_ANDROID = By
      .xpath("//a[@href='https://play.google.com/store/apps/details?id=com.valar.pintu']");
  By BUTTON_DOWNLOAD_APP_IOS = By
      .xpath("//a/img[@src='/static/images/pintu/badge-appstore.png']");
}
