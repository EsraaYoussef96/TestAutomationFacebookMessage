/*
package utilities;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import static commons.CommonPaths.SCREENSHOTS;


public class ScreenshotUtil {
    private  WebDriver driver;
    public ScreenshotUtil(WebDriver driver) {
        this.driver = driver;
    }
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

 /*
   Take Screenshot in case of pass or failure ..
    public void takeScreenShot(){
        var camera =(TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot, new File("D://Esraa ITI//automation//Esraa_Demo//src//main//resources//screenshots/test.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}*/
