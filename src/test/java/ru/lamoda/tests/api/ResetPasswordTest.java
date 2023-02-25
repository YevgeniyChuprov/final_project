package ru.lamoda.tests.api;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.api.models.ResetPasswordResponseModel;
import ru.lamoda.tests.api.steps.ResetPasswordSteps;

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
