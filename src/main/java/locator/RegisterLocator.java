package locator;

import org.openqa.selenium.By;

public interface RegisterLocator {

  By BUTTON_DOWNLOAD_PINTU = By.xpath("//div[contains(text(),'Download Pintu')]");
  By BUTTON_CONTACT_CUSTOMER_SUPPORT = By
      .xpath("//div[contains(text(),'Contact Customer Support')]");
}
