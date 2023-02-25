package ru.lamoda.tests.api.steps;

import io.qameta.allure.Step;
import ru.lamoda.tests.api.models.*;
import ru.lamoda.tests.api.specs.BaseSpecs;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketSteps {
    @Step("Добавление товара в корзину")
    public BasketResponseModel addProduct() {
        AddBasketRequestModel requestModel = new AddBasketRequestModel();
        AddBasketRequestModel.City city = new AddBasketRequestModel.City();

        city.setCityAoid("7700000000000");

        requestModel.setSku("RTLACF668701INL");
        requestModel.setGeo(city);
        requestModel.setItem_selection_enabled(false);


        return given()
                .spec(BaseSpecs.request)
                .body(requestModel)
                .when()
                .post("/api/v1/cart/add")
                .then()
                .spec(BaseSpecs.response200)
                .extract().as(BasketResponseModel.class);
    }

    @Step("Увеличение количества выбранного товара в корзине")
    public BasketResponseModel quantitySet() {
        QuantitySetRequestModel setRequest = new QuantitySetRequestModel();
        QuantitySetRequestModel.City city = new QuantitySetRequestModel.City();

        city.setCityAoid("7700000000000");

        setRequest.setQuantity(2);
        setRequest.setGeo(city);
        setRequest.setSku("RTLACF668701INL");
        setRequest.setItemSelectionEnabled(false);

        return given()
                .spec(BaseSpecs.request)
                .body(setRequest)
                .when()
                .post("/api/v1/cart/quantity_set")
                .then()
                .spec(BaseSpecs.response200)
                .extract().as(BasketResponseModel.class);
    }

    @Step("Удалние из корзины")
    public BasketResponseModel remove() {
        RemoveBascetRequestModel requestModel = new RemoveBascetRequestModel();
        AddBasketRequestModel.City city = new AddBasketRequestModel.City();

        city.setCityAoid("7700000000000");
        String[] skus = {"RTLACF668701INL"};
        requestModel.setSkus(skus);
        requestModel.setGeo(city);
        requestModel.setItem_selection_enabled(false);

        return given()
                .spec(BaseSpecs.request)
                .body(requestModel)
                .when()
                .post("/api/v1/cart/remove")
                .then()
                .spec(BaseSpecs.response200)
                .extract().as(BasketResponseModel.class);
    }

    @Step("Проверка ответа на получение скидки")
    public void addProductResponse(BasketResponseModel responseModel, BasketResponseModel testData) {
        assertEquals(testData.getTotalDiscount(), responseModel.getTotalDiscount());
        assertEquals(testData.getTotalQuantity(), responseModel.getTotalQuantity());
        assertEquals(testData.getTotalPrice(), responseModel.getTotalPrice());
    }
}
