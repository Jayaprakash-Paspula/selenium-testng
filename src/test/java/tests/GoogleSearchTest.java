package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Search Engine")
@Feature("Google Search")
public class GoogleSearchTest extends BaseTest {

    @Test(description = "Verify Google homepage title")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Open Google homepage")
    public void verifyGoogleTitle() {

        Allure.step("Open Google website");
        driver.get("https://www.google.com");

        Allure.step("Verify page title contains Google");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}
