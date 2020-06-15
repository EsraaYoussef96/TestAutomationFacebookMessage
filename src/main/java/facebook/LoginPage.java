package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private By usernameField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='pass']");
    private By loginButton   = By.xpath("//button[@id='loginbutton']");
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void  setUsername (String username){

        driver.findElement(usernameField).sendKeys(username);
    }
    public void  setPassword (String password){

        driver.findElement(passwordField).sendKeys(password);
    }
//public MyHome clickLogInButton()
    public void clickLogInButton(){
        driver.findElement(loginButton).click();
        //return new MyHome(driver);
    }

}
