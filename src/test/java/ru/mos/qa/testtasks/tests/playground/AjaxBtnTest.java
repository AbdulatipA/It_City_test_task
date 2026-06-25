package ru.mos.qa.testtasks.tests.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxBtnTest {
    private WebDriver driver;
    private WebDriverWait wait;

    private By ajaxButton = By.xpath("//button[@id='ajaxButton']");
    private By bgSuccess = By.className("bg-success");
    private String findText = "Data loaded with AJAX get request.";


    public void clickToBtn() {
        driver.get("http://uitestingplayground.com/ajax");
        driver.findElement(ajaxButton).click();
    }

    public String waitWebElement(){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(bgSuccess)).getText();
    }

    public AjaxBtnTest(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public String getFindText() {
        return findText;
    }
}
