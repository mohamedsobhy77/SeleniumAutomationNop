package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {
    private WebDriver driver;
    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickAlertButton() {
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
    }
    public void ClickConfirmButton() {
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
    }
    public void ClickPromptButton() {
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }
    public void alert_SetText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }
    public String getResultText(){
        return driver.findElement(By.id("result")).getText();
    }




}
