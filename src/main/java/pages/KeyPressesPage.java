package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setText(String text) {
        driver.findElement(By.id("target")).sendKeys(text);
    }

    public String getText() {
        return driver.findElement(By.id("result")).getText();
    }
}
