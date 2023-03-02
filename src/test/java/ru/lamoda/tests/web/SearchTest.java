package ru.lamoda.tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.lamoda.tests.TestBase;
import ru.lamoda.tests.web.pages.MainPage;
import ru.lamoda.tests.web.pages.SearchPage;

@Feature("UI тесты lamoda.ru")
@Story("Поиск товара")
@Tag("ui")
@Owner("chuprov")
public class SearchTest extends TestBase {

    private final String productName = "зимняя куртка",
            wrongSearch = "132421sdgfs4t34tsdgbd";

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void searchProduct() {
        new MainPage().search(productName);
        new SearchPage().checkProduct(productName);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void wrongSearchProduct() {
        new MainPage().search(wrongSearch);
        new SearchPage().checkWrongSearch(wrongSearch);
    }
}
