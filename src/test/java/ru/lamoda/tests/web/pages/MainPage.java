package ru.lamoda.tests.web.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement unknownLocation = $x("//span[contains(text(), 'Укажите регион доставки' )]"),
            location = $x("//span/span[@class ='notranslate']"),
            confirmationButton = $x("//button[text()='Перейти к покупкам']"),
            searchInput = $x("//header//input"),
            locationInput = $x("//input[@id='suggest-city1']"),
            openInput = $x("//div[@class='input-material__input-group']");

    private SelenideElement exactChoiceLocation(String exactChoice) {
        return $x(String.format("//*[text()='%s']", exactChoice));
    }

    private SelenideElement forWhom(String forWhom) {
        return $x(String.format("//a[@aria-label = '%s']", forWhom));
    }

    private SelenideElement selectLocation(String cityName) {
        return $x(String.format("//span[text() = '%s']", cityName));
    }

    private SelenideElement elementMenu(String elementName) {
        return $x(String.format("//a[text() = '%s']", elementName));
    }

    @Step("Открываем окно выбора города")
    public MainPage clickLocation() {
        unknownLocation.click();
        return this;
    }

    @Step("Выбор города")
    public MainPage selectCity(String cityName) {
        selectLocation(cityName).click();
        return this;
    }

    @Step("Подтверждение выбранного города")
    public MainPage confirmationCity() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        confirmationButton.click();
        return this;
    }

    @Step("Проверка, что выбран {cityName}")
    public MainPage checkLocation(String cityName) {
        location.shouldHave(text(cityName));
        return this;
    }

    @Step("Поиск {productName}")
    public MainPage search(String productName) {
        searchInput.setValue(productName).pressEnter();
        return this;
    }

    @Step("Выбраны - {forWhom}")
    public MainPage selectForWhom(String forWhom) {
        forWhom(forWhom).click();
        return this;
    }

    @Step("Клик по элементу меню - {elementName}")
    public MainPage clickElementMenu(String elementName) {
        elementMenu(elementName).click();
        return this;
    }

    @Step("Клик по элементу меню - {elementName}")
    public MainPage hoverElementMenu(String elementName) {
        elementMenu(elementName).hover();
        return this;
    }

    @Step("Ввод названия города {locationName}")
    public MainPage enterLocationName(String locationName) {
        openInput.click();
        locationInput.setValue(locationName).pressEnter();
        return this;
    }

    @Step("Выбор точного местоположения")
    public MainPage clickExactChoiceLocation(String exactChoice) {
        exactChoiceLocation(exactChoice).click();
        return this;
    }
}
