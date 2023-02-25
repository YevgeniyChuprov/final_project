package ru.lamoda.tests.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private final SelenideElement searchHeader = $("h2");
    private final SelenideElement nothingFound = $("h1");

    @Step("Найдены товары по запросу {productName}")
    public SearchPage checkProduct(String productName){
        searchHeader.shouldHave(text(String.format("Товары по запросу «%s»", productName)));
        return this;
    }
    @Step("Товары по запросу {productName} не найдены")
    public SearchPage checkWrongSearch(String productName){
        nothingFound.shouldHave(text(String.format("Ничего не нашли по запросу «%s»", productName)));
        return this;
    }
}
