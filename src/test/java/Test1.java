import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Test1 {

    @Test
    void test1() {
        given()
                .baseUri("http://json-schema.org/draft-07/schema")
        .when()
                .get("http://json-schema.org/draft-07/schema")
        .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("accounts.schema.json"))
        ;
    }
}
