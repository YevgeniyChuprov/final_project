package ru.lamoda.tests.api;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.api.models.*;
import ru.lamoda.tests.api.steps.BasketSteps;

public class BasketTest {

    @Test
    @Description("Добавление товара в корзину")
    public void addProduct() {
        BasketSteps basketSteps = new BasketSteps();
        BasketResponseModel testData = new BasketResponseModel();
        testData.setTotalDiscount(0);
        testData.setTotalQuantity(1);
        testData.setTotalPrice(5799);

        basketSteps.remove();
        BasketResponseModel responseModel = basketSteps.addProduct();
        basketSteps.addProductResponse(responseModel, testData);
    }

    @Test
    @Description("Увеличение колличества выбранного товара")
    public void quantitySet() {
        BasketSteps basketSteps = new BasketSteps();
        BasketResponseModel testData = new BasketResponseModel();
        testData.setTotalDiscount(0);
        testData.setTotalQuantity(2);
        testData.setTotalPrice(11598);


        basketSteps.addProduct();
        BasketResponseModel responseModel = basketSteps.quantitySet();
        basketSteps.addProductResponse(responseModel, testData);
    }

    @Test
    @Description("Удаление товара из корзины")
    public void remove() {
        BasketSteps basketSteps = new BasketSteps();
        BasketResponseModel testData = new BasketResponseModel();
        testData.setTotalDiscount(0);
        testData.setTotalQuantity(0);
        testData.setTotalPrice(0);

        BasketResponseModel responseModel = basketSteps.remove();
        basketSteps.addProductResponse(responseModel, testData);
    }
}

