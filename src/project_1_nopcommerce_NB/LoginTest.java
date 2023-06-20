package project_1_nopcommerce_NB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl =
 * https://demo.nopcommerce.com/login?returnUrl=%2F
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class LoginTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        //2. Open the Url into browser
        driver.get(baseUrl);
        // maximise the browser
        driver.manage().window().maximize();
        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);
       // 4. Print the current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is : " + currentUrl);
        //5. Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source : " + pageSource);
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.name("Email"));
        emailField.sendKeys("jamesbond1212@gmail.com");
        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Bond007%");
        //8. Close the browser
        driver.close();

    }
}
