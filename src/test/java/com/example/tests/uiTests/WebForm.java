package com.example.tests.uiTests;

import com.example.utilities.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebForm {

    @BeforeEach
    public void setUp() {
        Driver.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
    }

    @Test
    public void testSubmitForm() {
        WebElement nameInput = Driver.getDriver().findElement(By.id("my-text-id"));
        nameInput.sendKeys("John Doe");

        WebElement passwordInput = Driver.getDriver().findElement(By.cssSelector("input[name='my-password']"));
        passwordInput.sendKeys("password");

        WebElement commentInput = Driver.getDriver().findElement(By.cssSelector("textarea[class='form-control']"));
        commentInput.sendKeys("This is a comment");

        WebElement disabledInput = Driver.getDriver().findElement(By.cssSelector("input[name='my-disabled']"));
        Assertions.assertFalse(disabledInput.isEnabled());

        WebElement readonlyInput = Driver.getDriver().findElement(By.cssSelector("input[name='my-readonly']"));
        Assertions.assertNotNull(readonlyInput.getAttribute("readonly"));

        Select select = new Select(Driver.getDriver().findElement(By.cssSelector("select[class='form-select']")));
        select.selectByValue("1");
        Assertions.assertEquals("1", select.getFirstSelectedOption().getAttribute("value"));

        select.selectByValue("2");
        Assertions.assertEquals("2", select.getFirstSelectedOption().getAttribute("value"));

        select.selectByValue("3");
        Assertions.assertEquals("3", select.getFirstSelectedOption().getAttribute("value"));

        Driver.closeDriver();
    }
}

