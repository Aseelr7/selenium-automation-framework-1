package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramMainPage_PF {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[contains(@enabled type,'submit')]")
    public WebElement submitButton;

    public InstagramMainPage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void sendUserName(String userName){
        this.userNameInput.sendKeys(userName);
    }
    public void sendPass(String password){
        this.passwordInput.sendKeys(password);
    }
    public void clickSubmit(){
        this.submitButton.click();
    }
}
