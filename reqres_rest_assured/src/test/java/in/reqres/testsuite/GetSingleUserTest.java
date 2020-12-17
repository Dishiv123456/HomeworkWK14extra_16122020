package in.reqres.testsuite;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleUserTest extends TestBase {

    @Test
    public void getSingleUser() {

        Response response = given()
                .pathParam("id", 1)
                .when()
                .get("/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
