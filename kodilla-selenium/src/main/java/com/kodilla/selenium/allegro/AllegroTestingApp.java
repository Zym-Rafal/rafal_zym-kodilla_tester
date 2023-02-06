package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("https://www.allegro.pl");

        WebElement cookiesCombo = driver.findElement(By.cssSelector("[class='mgn2_14 mp0t_0a m9qz_yp mp7g_oh mse2_40 mqu1_40 mtsp_ib mli8_k4 mp4t_0 munh_0 m911_5r mefy_5r mnyp_5r mdwl_5r msbw_2 mldj_2 mtag_2 mm2b_2 mqvr_2 msa3_z4 mqen_m6 meqh_en m0qj_5r mh36_16 mvrt_16 mg9e_0 mj7a_0 mjir_sv m2ha_2 m8qd_qh mjt1_n2 b1vf8 mgmw_9u msts_enp mrmn_qo mrhf_u8 m31c_kb m0ux_fp bnpxh mjru_k4 _158e2_4-oWM m3h2_0 m3h2_16_s mryx_24 mryx_0_s mryx_24_x m7er_0k']"));
        cookiesCombo.click();

        WebElement categoryCombo = driver.findElement(By.cssSelector("[class='mr3m_1 m7er_k4 mj6k_n7 sy40i mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4']"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement searchCombo = driver.findElement(By.cssSelector("[class='msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_Y5CDc']"));
        searchCombo.sendKeys("mavic mini");
        searchCombo.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='mpof_ki mqen_m6 mp7g_oh mh36_8 mvrt_8 mg9e_8 mj7a_8 m7er_k4 mjyo_6x mgmw_og _6a66d_snEkI _6a66d_wdSAd']")));

        List<WebElement> products = driver.findElements(By.cssSelector("[class='mpof_ki mqen_m6 mp7g_oh mh36_8 mvrt_8 mg9e_8 mj7a_8 m7er_k4 mjyo_6x mgmw_og _6a66d_snEkI _6a66d_wdSAd']"));
        products.forEach(product -> System.out.println(product.getText()));
    }
}
