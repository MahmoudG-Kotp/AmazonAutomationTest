package mdi_automation_task;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import mdi_automation_task.pages.P01_Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;

public class Hooks {

    //Opens browser (order = 0) to give it a prior to run before each test scenario
    @Before(order = 0)
    public void openBrowser() {
        Browser.open();
    }

    @Before(order = 1, value = "@HomePageTestScenario")
    public void navigateToHomePage() {
        Browser.navigateTo(P01_Home.HOME_URL);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Browser.quit();
    }


    public static class Browser {
        private static WebDriver mainDriver;

        public static WebDriver getDriver() {
            return mainDriver;
        }

        private static void open() {
            WebDriverManager.chromedriver().setup();
            mainDriver = new ChromeDriver();
            mainDriver.manage().window().maximize();
            implicitWait(5);
        }

        public static void navigateTo(String Link) {
            //Navigate to specific webpage
            mainDriver.navigate().to(Link);
        }

        public static WebDriver switchTo(int windowIndex) {
            return mainDriver.switchTo().window(new ArrayList<>(mainDriver.getWindowHandles()).get(windowIndex));
        }

        public static void implicitWait(int seconds) {
            mainDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        }

        public static WebDriverWait explicitWait(int seconds) {
            return new WebDriverWait(mainDriver, Duration.ofSeconds(seconds));
        }

        public static void closeWindow(int windowIndex) {
            switchTo(windowIndex).close();
            switchTo(windowIndex - 1);
        }

        private static void quit() throws InterruptedException {
            Thread.sleep(2000);
            mainDriver.quit();
        }

    }
}
