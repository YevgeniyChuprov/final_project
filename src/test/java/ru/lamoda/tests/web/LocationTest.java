package ru.lamoda.tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.TestBase;
import ru.lamoda.tests.web.pages.MainPage;


@Feature("UI тесты lamoda.ru")
@Story("Выбор местоположения")
@Tag("ui")
@Owner("chuprov")
public class LocationTest extends TestBase {
    private final String locationMoscow = "г. Москва",
            locationUfa = "г. Уфа",
            locationUfaley = "г. Верхний Уфалей";

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Проверка выбора города из списка")
    public void changeLocationChoosingName() {
        new MainPage().clickLocation()
                .selectCity(locationMoscow)
                .confirmationCity()
                .checkLocation(locationMoscow);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Проверка выбора города водом текста")
    public void changeLocationEnteringName() {
        new MainPage().clickLocation()
                .enterLocationName(locationUfa)
                .clickExactChoiceLocation(locationUfaley)
                .confirmationCity()
                .checkLocation(locationUfaley);
    }
}
