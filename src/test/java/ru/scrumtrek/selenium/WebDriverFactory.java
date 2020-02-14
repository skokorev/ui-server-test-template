package ru.scrumtrek.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    public static WebDriver getWebDriver()  {
        return createLocalWebdriver();
    }

    private static WebDriver createLocalWebdriver() {
        String webdriver = System.getenv("WEBDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver",
                null != webdriver ?
                        webdriver :
                        "/opt/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1600, 1200));
        return driver;
    }
}
