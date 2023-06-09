package com.kevindubois.knativequarkusvoter;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.equalTo;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class VoteFunctionTest {
    
    @Test
    public void testVote() {
        given()
            .contentType("application/json")
            .body("{\"shortname\": \"test\"}")
            .post("/vote")
            .then()
            .statusCode(200)
            .body("shortname", equalTo("test"));


        given()
            .contentType("application/json")
            .body(new Vote("test"))
            .post("/vote")
            .then()
            .statusCode(200)
            .body("shortname", equalTo("test"));            
    }
}
