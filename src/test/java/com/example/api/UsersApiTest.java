package com.example.api;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UsersApiTest {

    @Test
    public void getUsersShouldReturn200() {

        RestAssured.baseURI = "https://reqres.in/api";

        int statusCode =
                given()
                .when()
                    .get("/users?page=2")
                .then()
                    .extract()
                    .statusCode();

        Assert.assertEquals(statusCode, 200);
    }
}
