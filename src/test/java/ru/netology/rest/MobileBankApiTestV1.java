package ru.netology.rest;



import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;


public class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("http://localhost:9999/api/v1")
                .when()
                .get("/demo/accounts")
                .then()
                .statusCode(300);
                //.body(matchesJsonSchemaInClasspath("accounts.schema.json"));




    }



    @Test
    void shouldReturnCurrency() {
        given()
                .baseUri("http://localhost:9999/api/v1")
                .when()
                .get("/demo/accounts")
                .then()
                .body("[0].currency", equalTo("RUR"))
                .body("[1].currency", equalTo("USD"));
    }


}








