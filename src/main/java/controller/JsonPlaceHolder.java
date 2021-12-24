package controller;

import defaultrequest.DefaultRequest;
import io.restassured.response.Response;

public class JsonPlaceHolder extends DefaultRequest {

  public Response getJsonPlaceHolder() {
    Response response = service()
        .get("posts");

    response.getBody().prettyPrint();

    return response;
  }

  public Response postJsonPlaceHolder(String title, String body) {
    String bodyRequest = "{\n"
        + "    \"title\": \" " + title + " \",\n"
        + "    \"body\": \" " + body + " \"\n"
        + "}";
    Response response = service()
        .body(bodyRequest)
        .post("posts");

    response.getBody().prettyPrint();

    return response;
  }
}
