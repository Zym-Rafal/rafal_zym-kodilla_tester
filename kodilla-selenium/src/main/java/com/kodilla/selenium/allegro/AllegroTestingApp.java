package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@class=\"mr3m_1 m7er_k4 mj6k_n7 sy40i mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement searchCombo = driver.findElement(By.xpath("//*[@class=\"msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_Y5CDc\"]"));
        searchCombo.sendKeys("mavic mini");
        searchCombo.submit();
    }
}
