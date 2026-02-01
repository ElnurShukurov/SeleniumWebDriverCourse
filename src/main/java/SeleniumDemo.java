import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        findLoginPageElements(driver);
//        findExceptionPageElements(driver);
        driver.quit();
    }

    private static void findExceptionPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        WebElement linkTextLocator = driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program"));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Java for beginners program"));

        WebElement inputFieldTagName = driver.findElement(By.tagName("input"));
        WebElement inputFieldClassName = driver.findElement(By.className("input-field"));
        WebElement inputFieldXpath = driver.findElement(By.xpath("//input[@class='input-field']"));
        WebElement inputFieldCSSSelector = driver.findElement(By.cssSelector("input.input-field"));

        List<WebElement> allButtons = driver.findElements(By.tagName("button"));

        WebElement editButtonID = driver.findElement(By.id("edit_btn"));
        WebElement editButtonName = driver.findElement(By.name("Edit"));
        WebElement editButtonXpath = driver.findElement(By.xpath("//button[@id='edit_btn']"));
        WebElement editButtonCSS = driver.findElement(By.cssSelector("button#edit_btn"));

        WebElement addButtonID = driver.findElement(By.id("add_btn"));
        WebElement addButtonName = driver.findElement(By.name("Add"));
        WebElement addButtonXpath = driver.findElement(By.xpath("//button[@id='add_btn']"));
        WebElement addButtonCSS = driver.findElement(By.cssSelector("button#add_btn"));
    }

    private static void findLoginPageElements(WebDriver driver) {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("anyUsername");
//        WebElement usernameInputFieldXpath = driver.findElement(By.xpath("//input[@id='username']"));
//        WebElement usernameInputFieldCSS = driver.findElement(By.cssSelector("input[id='username']"));

        WebElement passwordInputField = driver.findElement(By.name("password"));
        passwordInputField.sendKeys("anyPassword");
//        WebElement passwordInputFieldXpath = driver.findElement(By.xpath("//input[@name='password']"));
//        WebElement passwordInputFieldCSS = driver.findElement(By.cssSelector("input[id='password']"));

        WebElement submitButton = driver.findElement(By.className("btn"));
        submitButton.isDisplayed();
        submitButton.click();
//        WebElement submitButtonXpath = driver.findElement(By.xpath("//button[@id='submit']"));
//        WebElement submitButtonCSS = driver.findElement(By.cssSelector("button[id='submit']"));
/*
        List<WebElement> inputFields = driver.findElements(By.tagName("input"));

        WebElement linkTextLocator = driver.findElement(By.linkText("Practice Test Automation."));
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("Practice Test"));

        WebElement passwordFieldBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("username")));
        WebElement privacyPolicyLink = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Practice Test")));

        WebElement homeButton = driver.findElement(By.className("menu-item-home"));
 */
    }

    private static String chromeTest(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

    private static String firefoxTest(String url) {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

}
