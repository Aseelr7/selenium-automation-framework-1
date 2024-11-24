package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleMainPage {
    public  WebDriver driver;
    public WebElement aboutButton = driver.findElement(By.xpath("//a[text() = 'About']"));



    public GoogleMainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnAboutButton(){
        this.aboutButton.click();
    }
}