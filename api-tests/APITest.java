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
}
