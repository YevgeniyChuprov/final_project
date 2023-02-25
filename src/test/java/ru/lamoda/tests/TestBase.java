package ru.lamoda.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.lamoda.config.WebDriverProvider;
import ru.lamoda.helpers.Attach;

import java.util.Map;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.configuration();
//        Configuration.browser = System.getProperty("browser", "chrome");
//        Configuration.browserVersion = System.getProperty("browserVersion", "100");
//        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
//        Configuration.baseUrl = System.getProperty("base_url", "https://www.lamoda.ru");
//        Configuration.timeout = 30000;
//        Configuration.remote = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open("/");
    }


    @AfterEach
    void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        clearBrowserCookies();
    }
}
