package hooks;

import driver.WebdriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.File;

public class WebDriverHooks {

  @Before(value = "@web")
  public void beforeScenario() {
    WebdriverInit.initialize();
  }

  @After(value = "@web")
  public void afterScenario() {
    WebdriverInit.quit();
  }
}
