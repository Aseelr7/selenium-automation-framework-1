package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookMainPage_PF {

    @FindBy(xpath = "//input[@id = 'email']")
   public WebElement emailInputField;
    WebDriver driver;

    @FindBy(xpath = "//input[@id = 'pass']")
  public  WebElement passwordInputField;

    @FindBy(xpath = "//button[@name = 'login']")
   public WebElement loginBtn;

    public FaceBookMainPage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void sendEmail(String email){
        this.emailInputField.sendKeys(email);
    }

    public void sendPassword(String password){
        this.passwordInputField.sendKeys(password);
    }

    public void clickLogin(){
        this.loginBtn.click();
    }


}
