package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {
    @Test
    public void testHovers(){
        var hoversPage =  homePage.clickOnHovers();
        var figureCaption = hoversPage.hoverOnFigure(1);
        assertTrue(figureCaption.isDisplayed(),"The caption is not displayed");
        assertEquals(figureCaption.getText(),"name: user1","The header is not correct");
        assertEquals(figureCaption.getLinkText(),"View profile","The link text is not correct");
        assertTrue(figureCaption.getLink().endsWith("/users/1"),"The link is incorrect");
    }
}
