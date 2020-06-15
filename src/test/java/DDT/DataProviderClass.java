package DDT;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

    private WebDriver driver;
    public DataProviderClass(WebDriver driver) {
        this.driver = driver;
    }

    @DataProvider(name = "data-provider")
    public static Object[][] provideLoginData() {
        return new Object[][]{
                {"01150309964","Esraa016!!"}
        };
    }
}

