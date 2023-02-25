package ru.lamoda.tests.api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import ru.lamoda.config.WebDriverProvider;

import static io.restassured.RestAssured.with;
import static ru.lamoda.helpers.CustomApiListener.withCustomTemplates;

public class BaseSpecs {
    public static RequestSpecification request = with()
            .log().all()
            .baseUri("https://www.lamoda.ru")
            .filter(withCustomTemplates())
            .contentType("application/json")
            .cookies("sid", WebDriverProvider.config.getCookie())
            .log().all();

    public static ResponseSpecification response200 = new ResponseSpecBuilder()
            .log(LogDetail.ALL)
            .expectStatusCode(200)
            .build();

    public static ResponseSpecification response300 = new ResponseSpecBuilder()
            .log(LogDetail.ALL)
            .expectStatusCode(300)
            .build();
}
