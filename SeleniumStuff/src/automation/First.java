package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
            "/Users/fahad/Desktop/Java/SeleniumStuff/Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        String url = "https://amazon.com";

        driver.get(url);
        String title = driver.getTitle();
        String expected = "Amazon.com";
        System.out.println(title);

        if (title.contains(expected)) {
            System.out.println("test passed");
        } else {
            System.out.println("failed");
        }



        // to close the browser
        driver.close();
        driver.quit();
    }

    // driver.close - will only close the current window
    // driver.quit - will close all the windows
}
