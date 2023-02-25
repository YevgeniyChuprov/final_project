package ru.lamoda.tests.api;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.api.models.GetDiscountResponseModel;
import ru.lamoda.tests.api.steps.GetDiscountSteps;

@Tag("api")
@Epic("API")
@Owner("YevgeniyChuprov")
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
