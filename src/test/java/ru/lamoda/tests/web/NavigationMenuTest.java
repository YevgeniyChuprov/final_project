package ru.lamoda.tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.TestBase;
import ru.lamoda.tests.web.pages.MainPage;
import ru.lamoda.tests.web.pages.ProductsPage;

@Feature("UI тесты lamoda.ru")
@Story("Переход к котегориям товаров")
@Tag("ui")
public class NavigationMenuTest extends TestBase {
    private final String accessories = " Аксессуары",
            baggini = "Baggini",
            forWhom = "Товары для детей",
            baby = " Малышам";

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка перехода кликом по меню")
    public void selectingSectionInTheMenu() {
        new MainPage().clickElementMenu(accessories);
        new ProductsPage().checkProductType(accessories);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка открытия подменю при наведении")
    public void hoverSectionInTheMenu() {
        new MainPage().hoverElementMenu(accessories)
                .clickElementMenu(baggini);
        new ProductsPage().checkProductType(baggini);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка открытия детского раздела товаров")
    public void childrenProducts() {
        new MainPage().selectForWhom(forWhom)
                .clickElementMenu(baby);
        new ProductsPage().checkProductType(baby);
    }
}
