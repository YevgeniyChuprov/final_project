package ru.lamoda.tests.api;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.api.models.GetDiscountResponseModel;
import ru.lamoda.tests.api.steps.GetDiscountSteps;

public class GetDiscountTest {
    @Test
    @Description("Получение скидки 10%")
    public void getDiscount() {
        GetDiscountSteps getDiscount = new GetDiscountSteps();
        GetDiscountResponseModel testData = new GetDiscountResponseModel();

        testData.setCustomerId(109935);
        testData.setStatus("OK");
        testData.setEmailConfirmed(true);

        GetDiscountResponseModel responseModel = getDiscount.getDiscountRequest();
        getDiscount.getDiscountResponse(responseModel, testData);
    }
}
