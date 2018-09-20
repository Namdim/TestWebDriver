import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWiki {
    private WebDriver driver;
    private static ChromeDriverService service;

    @BeforeClass
    public static void createAndStartService() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("webDriver\\chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    @BeforeClass // Runs this method before the first test method in the current class is invoked
    public void setUp() {
    }

    @Test // Run web driver(Chrome)
    public void checkWebDriver(){
        driver = new ChromeDriver(service);
    }
}
