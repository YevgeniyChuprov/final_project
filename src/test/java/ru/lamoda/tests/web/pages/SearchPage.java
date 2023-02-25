package ru.lamoda.tests.web.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private final SelenideElement searchHeader = $("h2");
    private final SelenideElement nothingFound = $("h1");

    public SearchPage checkProduct(String productName){
        searchHeader.shouldHave(text(String.format("Товары по запросу «%s»", productName)));
        return this;
    }
    public SearchPage checkWrongSearch(String productName){
        nothingFound.shouldHave(text(String.format("Ничего не нашли по запросу «%s»", productName)));
        return this;
    }
}
