package ru.mos.qa.testtasks.tests.playground;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaygroundTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private AjaxBtnTest ajaxBtnTest;
    private SampleAppFormTest sampleAppFormTest;


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();

        ajaxBtnTest = new AjaxBtnTest(driver, wait);
        sampleAppFormTest = new SampleAppFormTest(driver, wait);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void AjaxData() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        ajaxBtnTest.clickToBtn();
        Assertions.assertEquals(ajaxBtnTest.getFindText(), ajaxBtnTest.waitWebElement());

    }

    @Test
    public void logIn() {
        sampleAppFormTest.logIn();
    }
}
