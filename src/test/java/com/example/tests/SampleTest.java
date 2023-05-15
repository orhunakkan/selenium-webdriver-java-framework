package com.example.tests;

import com.example.pages.SamplePage;
import com.example.utilities.Driver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    SamplePage samplePage = new SamplePage();

    @Test
    public void firstTest() {
        Driver.getDriver().get("https://bonigarcia.dev/selenium-webdriver-java/");
        assertEquals("Hands-On Selenium WebDriver with Java", samplePage.pageTitle.getText());
        Driver.closeDriver();
    }

}
