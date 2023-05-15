package com.example.pages;

import com.example.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePage {

    @FindBy(xpath = "//h1[@class='display-4']")
    public WebElement pageTitle;

    public SamplePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
