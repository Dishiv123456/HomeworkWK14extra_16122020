package in.reqres.testsuite;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetListOfUserTest extends TestBase {

    @Test
    public void getListOfUser() {
        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
