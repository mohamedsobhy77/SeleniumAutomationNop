package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {
    private WebDriver driver;

    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickClose() {
        driver.findElement(By.cssSelector(".modal-footer .btn-secondary")).click();
    }

    public String getText() {
        return driver.findElement(By.cssSelector(".modal-header h5")).getText();
    }

}