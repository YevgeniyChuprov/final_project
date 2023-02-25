package ru.lamoda.tests.api.steps;

import io.qameta.allure.Step;
import ru.lamoda.tests.api.models.ResetPasswordResponseModel;
import ru.lamoda.tests.api.specs.BaseSpecs;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResetPasswordSteps {

    @Step("Запрос на сброс пароля")
    public ResetPasswordResponseModel resetPasswordRequest(){
        return given()
                .spec(BaseSpecs.request)
                .when()
                .get("/apix/captcha/?action=resetpassword&t=1676886461278")
                .then()
                .spec(BaseSpecs.response300)
                .extract().as(ResetPasswordResponseModel.class);
    }

    @Step("Проверка ответа на сброс пароля")
    public void resetPasswordResponse(ResetPasswordResponseModel responseModel, ResetPasswordResponseModel testData){
        assertEquals(testData.getSiteKey(), responseModel.getSiteKey());
        assertEquals(testData.getStatus(), responseModel.getStatus());
        assertEquals(testData.getAction(), responseModel.getAction());
    }
}
