package facebook;

import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String alertGetText(){
       return driver.switchTo().alert().getText();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
}
