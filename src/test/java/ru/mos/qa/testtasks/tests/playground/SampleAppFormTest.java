package ru.mos.qa.testtasks.tests.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleAppFormTest {
    private WebDriver driver;
    private WebDriverWait wait;

    private By userNameInput = By.xpath("//input[@name='UserName']");
    private By passwordInput = By.xpath("//input[@name='Password']");
    private By btnLogIn = By.xpath("//button[@id='login']");

    public void logIn() {
        driver.get("http://uitestingplayground.com/sampleapp");
        driver.findElement(userNameInput).sendKeys("admin");
        driver.findElement(passwordInput).sendKeys("pwd");
        driver.findElement(btnLogIn).click();
    }

    public SampleAppFormTest(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
