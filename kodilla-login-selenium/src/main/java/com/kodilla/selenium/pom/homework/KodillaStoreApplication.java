package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStoreApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStoreSearch search = new KodillaStoreSearch(driver);
        search.text("school");
        driver.close();
    }
}
