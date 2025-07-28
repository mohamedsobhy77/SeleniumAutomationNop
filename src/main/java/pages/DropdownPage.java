package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    public By dropdownLocator = By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromDropDown(String option){
        getDropdownElement().selectByVisibleText(option);
    }
    public  List<String> getSelectedOption(){
        List<WebElement> selectedOptionsElements =getDropdownElement().getAllSelectedOptions();
        List<String>  selectedOptionsText = new ArrayList<>() ;
        for (WebElement element : selectedOptionsElements){
            selectedOptionsText.add(element.getText());
        }
        return selectedOptionsText;
    }
    public Select getDropdownElement(){
        return new Select(driver.findElement(dropdownLocator));
    }

}
