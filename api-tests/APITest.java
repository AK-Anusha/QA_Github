package api_tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITest {

    @Test
    public void getUsers() {
        Response res = RestAssured.get("https://jsonplaceholder.typicode.com/users");
        System.out.println("Response: " + res.getBody().asString());
    }
    @Test
public void createUserTest() {
    String payload = "{ \"name\": \"John\", \"email\": \"john@example.com\" }";

    Response res = RestAssured.given()
            .header("Content-Type", "application/json")
            .body(payload)
            .post("https://jsonplaceholder.typicode.com/users");

    Assert.assertEquals(res.getStatusCode(), 201);
    System.out.println(res.getBody().asString());
}
}
