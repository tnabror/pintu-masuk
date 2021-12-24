package steps.api;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

import controller.JsonPlaceHolder;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class ApiSteps {

  JsonPlaceHolder jsonPlaceHolder = new JsonPlaceHolder();

  @When("get json place holder")
  public void getJsonPlaceHolder() {
    Response response = jsonPlaceHolder.getJsonPlaceHolder();

    int statusCode = response.getStatusCode();
    Assert.assertEquals(200, statusCode);
    assertThat("response not valid with given schema",
        response.getBody().asString(),
        matchesJsonSchemaInClasspath("schemas/get-json-place-holder.json"));

  }

  @When("post json place holder with title {string} and body {string}")
  public void postJsonPlaceHolderWithTitleAndBody(String title, String body) {
    Response response = jsonPlaceHolder.postJsonPlaceHolder(title, body);

    int statusCode = response.getStatusCode();
    Assert.assertEquals(201, statusCode);
    Assert.assertEquals(title, response.path("title").toString().trim());
    Assert.assertEquals(body, response.path("body").toString().trim());
  }
}
