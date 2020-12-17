package in.reqres.testsuite;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostCreateUserTest extends TestBase {

    @Test
    public void postCreateUsers(){
        UserPojo userPojo=new UserPojo();
        userPojo.setName("Dishiv");
        userPojo.setJob("Software Testing");
        Response response =given()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();


    }


}
