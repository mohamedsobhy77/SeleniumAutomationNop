package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickOnFormAuthentication();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureArea secureArea = loginPage.clickLoginButton();
//        assertEquals(secureArea.getText(),"You logged into a secure area!",
//                "The message is incorrect");

//        assertEquals(secureArea.getText().contains("You logged into a secure area!"),true,
//                "The message is incorrect");
        assertTrue(secureArea.getText().contains("You logged into a secure area!"),
                "The message is incorrect");

    }
}
