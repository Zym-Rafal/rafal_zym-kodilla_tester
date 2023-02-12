package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStoreSearch {
    @FindBy(css = "input[name='search']")
    WebElement searchField;


    WebDriver driver;

    public KodillaStoreSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void text(String text) {
        searchField.sendKeys(text);
    }
}
