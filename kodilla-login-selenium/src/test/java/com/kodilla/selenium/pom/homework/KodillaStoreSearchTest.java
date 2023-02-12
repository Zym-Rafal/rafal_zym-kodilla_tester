package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStoreSearchTest {

    KodillaStoreSearch search;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        search = new KodillaStoreSearch(driver);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/KodillaStoreSearchTestData.csv", numLinesToSkip = 1)
    public void testCheckQuantityOfResults(String text, int quantity) {
        search.text(text);
        List<WebElement> results = driver.findElements(By.className("element"));
        assertEquals(quantity, results.size());
        driver.close();
    }
}