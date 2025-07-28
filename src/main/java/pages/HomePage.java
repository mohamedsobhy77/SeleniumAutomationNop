package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickOnFormAuthentication(){
//        driver.findElement(formAuthentication).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickOnDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickOnHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    private void clickLink(String link){
        driver.findElement(By.linkText(link)).click();

    }
    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertPage(driver);
    }
    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ModalPage clickModal() {
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }
}
