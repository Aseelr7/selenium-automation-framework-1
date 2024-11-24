package tests.facebook;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.FaceBookMainPage_PF;
import utils.WaitUtils;

public class EnterCredentialsTest extends BaseTest {

    @Test
    public void enterEmailAndPassword(){

        FaceBookMainPage_PF faceBookMainPageFactory = new FaceBookMainPage_PF(driver);
        String expectedUrl = "https://www.facebook.com/";
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,currentUrl,"Did not navigate to correct Url");

        faceBookMainPageFactory.sendEmail("james.charles@gay.com");
        WaitUtils.applyGlobalWait();
        faceBookMainPageFactory.sendPassword("james212@11");
        WaitUtils.applyGlobalWait();

        faceBookMainPageFactory.clickLogin();
    }

}
