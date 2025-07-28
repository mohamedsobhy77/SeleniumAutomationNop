package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void uploadFile(String filePath) {
        driver . findElement(By.id("file-upload")).sendKeys(filePath);
        clickUploadButton();
}
    public void clickUploadButton() {
        driver.findElement(By.id("file-submit")).click();
    }
    public String getUploadedFileName() {
        return driver.findElement(By.id("uploaded-files")).getText();
    }
}
