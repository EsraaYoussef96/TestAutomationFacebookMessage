package base;

import com.google.common.io.Files;
import facebook.AlertsPage;
import facebook.LoginPage;
import facebook.MyHome;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import static commons.CommonPaths.BINARIES;
import static commons.CommonPaths.SCREENSHOTS;

public class BaseTests {
    public static WebDriver driver;
    protected LoginPage loginPage;
    protected MyHome myHome;
    protected AlertsPage alertsPage;


    @BeforeClass

    public void setUpMethod() {

        System.setProperty("webdriver.chrome.driver", BINARIES + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/messages/t/aseel.mohammed.9");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        myHome = new MyHome(driver);
    }

    @AfterMethod
    // Take Screenshot in case of test failure only ..
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            System.out.println("Screenshot token ");

            try {
                Files.move(screenshot, new File(SCREENSHOTS+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void exit() {
        driver.quit();
    }
}


