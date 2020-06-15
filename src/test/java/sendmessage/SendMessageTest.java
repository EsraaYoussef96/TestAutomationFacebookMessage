package sendmessage;

import DDT.DataProviderClass;
import base.BaseTests;
import facebook.AlertsPage;
import facebook.LoginPage;
import facebook.MyHome;
import org.testng.annotations.Test;


public class SendMessageTest extends BaseTests {

    private MyHome myHome;
    private AlertsPage alertsPage;

    @Test (dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testSuccessfulMessageSend(String username ,String password) {
        myHome = new MyHome(driver);
        loginPage=new LoginPage(driver);

        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLogInButton();
        myHome.clickOnBlankPage();
        myHome.clickOnFriendsName();
        myHome.sendMessage("This is an Automated POM message ");
      //  alertsPage.alertGetText();
      //  alertsPage.dismissAlert();


    }

}
