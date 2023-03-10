package ru.lamoda.tests.api;

import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.api.models.ResetPasswordResponseModel;
import ru.lamoda.tests.api.steps.ResetPasswordSteps;

@Tag("api")
@Epic("API")
@Owner("chuprov")
@Feature("API test")
@Story("lamoda")
public class ResetPasswordTest {
    @Test
    @Description("Сброс пароля")
    public void resetPassword() {
        ResetPasswordSteps resetPassword = new ResetPasswordSteps();
        ResetPasswordResponseModel testData = new ResetPasswordResponseModel();

        testData.setAction("captcha");
        testData.setStatus("ok");
        testData.setSiteKey("6LcCcfISAAAAAGsXZrTGmEiFFResG_0d_xfCo4Ha");

        ResetPasswordResponseModel responseModel = resetPassword.resetPasswordRequest();
        resetPassword.resetPasswordResponse(responseModel, testData);
    }
}
