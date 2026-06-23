package ru.mos.qa.testtasks.tests.playground;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaygroundTest {
    private WebDriver driver;
    private WebDriverWait wait;

    private By ajaxButton = By.xpath("//button[@id='ajaxButton']");
    private By bgSuccess = By.className("bg-success");

    private By userNameInput = By.xpath("//input[@name='UserName']");
    private By passwordInput = By.xpath("//input[@name='Password']");
    private By btnLogIn = By.xpath("//button[@id='login']");


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void AjaxData() {
        driver.get("http://uitestingplayground.com/ajax");
        driver.findElement(ajaxButton).click();
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(bgSuccess));
        String findText = "Data loaded with AJAX get request.";
        Assertions.assertEquals(findText, webElement.getText());
    }

    @Test
    public void logIn() {
        driver.get("http://uitestingplayground.com/sampleapp");
        driver.findElement(userNameInput).sendKeys("admin");
        driver.findElement(passwordInput).sendKeys("pwd");
        driver.findElement(btnLogIn).click();
    }
}
