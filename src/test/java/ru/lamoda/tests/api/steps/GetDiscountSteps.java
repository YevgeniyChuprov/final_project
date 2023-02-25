package ru.lamoda.tests.api.steps;

import io.qameta.allure.Step;
import ru.lamoda.tests.api.models.GetDiscountResponseModel;
import ru.lamoda.tests.api.specs.BaseSpecs;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetDiscountSteps {
    @Step("Запрос на получение скидки")
    public GetDiscountResponseModel getDiscountRequest() {
        return given()
                .spec(BaseSpecs.request)
                .contentType("multipart/form-data")
                .multiPart("subscription_type", "DEFAULT")
                .multiPart("email", "test@test.com")
                .multiPart("gender", "M")
                .multiPart("location", "subscr_footer")
                .multiPart("url", "/wishlist/")
                .when()
                .post("/subscribe/newsletter/")
                .then()
                .spec(BaseSpecs.response200)
                .extract().as(GetDiscountResponseModel.class);
    }

    @Step("Проверка ответа на получение скидки")
    public void getDiscountResponse(GetDiscountResponseModel responseModel, GetDiscountResponseModel testData) {
        assertEquals(testData.getCustomerId(), responseModel.getCustomerId());
        assertEquals(testData.getStatus(), responseModel.getStatus());
        assertEquals(testData.isEmailConfirmed(), responseModel.isEmailConfirmed());
    }
}
