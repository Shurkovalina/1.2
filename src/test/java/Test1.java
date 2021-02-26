import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Test1 {

    @Test
    void test1() {
        given()
                .baseUri("accounts.schema.json")
        .when()
                .get("accounts.schema.json")
        .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("accounts.schema.json"))
        ;
    }
}
