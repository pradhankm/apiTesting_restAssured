package apiTesting;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void exampleApiTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        RestAssured.given()
                .get("/todos/1")
                .then()
                .statusCode(200)
                .assertThat()
                .body("title", equalTo("delectus aut autem"));
    }
}
