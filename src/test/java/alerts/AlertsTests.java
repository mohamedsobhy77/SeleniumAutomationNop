package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

    public class AlertsTests extends BaseTests {
        @Test
        public void testAcceptAlert() {
          var javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
            javaScriptAlertsPage.ClickAlertButton();
            javaScriptAlertsPage.alert_clickToAccept();
            assertEquals(javaScriptAlertsPage.getResultText(), "You successfully clicked an alert", "Alert result text is incorrect");

        }

     }

