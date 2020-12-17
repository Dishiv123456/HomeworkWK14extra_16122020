package in.reqres.testsuite;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostLoginSuccessfullyTest extends TestBase {
    @Test
    public void postLoginSuccessfully(){
        UserPojo userPojo=new UserPojo();
        userPojo.setEmail("eve.holt@reqres.in");
        userPojo.setPassword("cityslicka");


        Response response =given()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
