package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {
    @Test
    public void testDropdown(){
        var dropdownPage =homePage.clickOnDropdown();
        String option  = "Option 1";
        dropdownPage.selectFromDropDown(option);
        List<String> selectedText = dropdownPage.getSelectedOption();
        assertEquals(selectedText.size(),1,"The size is incorrect");
        assertTrue(selectedText.contains(option),"The option is not selected");
    }
}
