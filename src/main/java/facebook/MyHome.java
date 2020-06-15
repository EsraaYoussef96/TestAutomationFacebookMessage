package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyHome {
    private WebDriver driver;
    private By FriendsName = By.xpath("//span[@class='_1ht6 _7st9' and contains(. ,'Aseel Mohammed')]");
    private By TextBox = By.xpath("//div[@class='_1mf _1mj']");
   private By Blank = By.xpath("//div[@class=\"_3ixn\"]");

   public MyHome(WebDriver driver) {
       this.driver = driver;
   }

   public void clickOnBlankPage(){

       driver.findElement(Blank).click();
   }

    public void clickOnFriendsName(){
       // Actions actions = new Actions(driver);
     //   actions.clickAndHold();
        driver.findElement(FriendsName).click();
         }

    public void sendMessage(String message) {
        driver.findElement(TextBox).sendKeys(message, Keys.ENTER);
    }

}