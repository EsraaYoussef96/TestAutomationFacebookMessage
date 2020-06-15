package DDT;

import Readers.ExcelReader;
import Readers.LoadProperties;
import base.BaseTests;
import facebook.AlertsPage;
import facebook.LoginPage;
import facebook.MyHome;
import org.testng.annotations.Test;


public class SendMessageTestUsingProFile extends BaseTests {

    private MyHome myHome;
    private AlertsPage alertsPage;
    private LoadProperties loadProperties;
    private ExcelReader excelReader;
    public String Email = LoadProperties.UserData.getProperty("Email");
    public String Password = LoadProperties.UserData.getProperty("Password");


    @Test (priority = 1,alwaysRun = true)
    public void testSuccessfulMessageSend() {
        myHome = new MyHome(driver);
        loginPage=new LoginPage(driver);
        loginPage.setUsername(Email);
        loginPage.setPassword(Password);
        loginPage.clickLogInButton();
        myHome.clickOnBlankPage();
        myHome.clickOnFriendsName();
        myHome.sendMessage("This is an Automated POM message ");
      //  alertsPage.alertGetText();
      //  alertsPage.dismissAlert();


    }

}
