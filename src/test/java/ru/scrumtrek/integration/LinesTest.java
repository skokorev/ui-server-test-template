package ru.scrumtrek.integration;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import ru.scrumtrek.domain.Line;
import ru.scrumtrek.selenium.WebDriverFactory;
import ru.scrumtrek.selenium.pages.MainPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LinesTest {
    private static WebDriver webDriver;
    private static MainPage mainPage;

    @BeforeAll
    public static void setUp() {
        webDriver = WebDriverFactory.getWebDriver();
        mainPage = MainPage.open(webDriver);
    }

    @AfterAll
    public static void tearDown() {
        mainPage = null;
        webDriver.close();
        webDriver.quit();
        webDriver = null;
    }

    //Add tests here
}
