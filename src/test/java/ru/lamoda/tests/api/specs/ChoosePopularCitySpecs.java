package ru.lamoda.tests.api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class ChoosePopularCitySpecs {
    public static RequestSpecification request = with()
            .log().all()
            .baseUri("https://www.lamoda.ru")
            .log().all();

    public static ResponseSpecification response = new ResponseSpecBuilder()
            .log(LogDetail.ALL)
            .expectStatusCode(200)
            .build();
}
