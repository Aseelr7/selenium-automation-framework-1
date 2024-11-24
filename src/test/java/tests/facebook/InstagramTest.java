package tests.facebook;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.InstagramMainPage_PF;
import utils.WaitUtils;

public class InstagramTest extends BaseTest {

    @Test
            public void enterCredentials() {
        InstagramMainPage_PF instagramMainPagePf = new InstagramMainPage_PF(driver);

        String expectedUrl = "https://www.instagram.com/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl, "Did not Navigate to correct Url");

        instagramMainPagePf.sendUserName("asdf");
        WaitUtils.applyGlobalWait();
        instagramMainPagePf.sendPass("11233");

        WaitUtils.applyGlobalWait();
        instagramMainPagePf.clickSubmit();
        WaitUtils.applyGlobalWait();
    }
}
