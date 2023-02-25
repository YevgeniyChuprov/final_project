package ru.lamoda.tests.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    private final SelenideElement productType = $x("//div[contains(@class,'swiper-slide')]/span");
    @Step("Проверка открытия страницы товаров {productName}")
    public ProductsPage checkProductType(String productName){
        productType.shouldHave(text(productName));
        return this;
    }
}
