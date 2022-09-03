package definition;

import base.AppBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationHooks  extends AppBase {

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        TimeUnit.SECONDS.sleep(3);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
