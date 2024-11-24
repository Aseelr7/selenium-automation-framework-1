package tests.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest extends base.BaseTest {

    @Test
    public void myBrowserTest(){
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and navigating to the correct url");

        Assert.assertEquals(actualUrl, expectedUrl, "failed!");
    }
}
