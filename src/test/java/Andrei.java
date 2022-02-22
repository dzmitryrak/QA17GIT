
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//sldhfkjsdhfkjsdjfkhskjfhkjshfs
import static org.testng.Assert.assertTrue;
// hdjhfjksdhfjksdfkhsdjkfhsjkdhfjkshfjkshfkjhskjfhskjhfsdfsfsdfsdf
    class SignUpTest {
        WebDriver driver;
        @BeforeMethod(alwaysRun = true)
        public void setUP(){
//uehuidshduidhsufhusdfsdfsf
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
        }
        @Test
        public void zipCode() {
        /*
        1.Открыть браузер
        2. https://www.sharelane.com/cgi-bin/register.py
        3. вводим 5 цифр, например 12345
        4. нажать continued
        5. проверить видимость кнопки register
         */

            driver.get("https://www.sharelane.com/cgi-bin/register.py");
            driver.findElement(By.name("zip_code")).sendKeys("12345");
            driver.findElement(By.cssSelector("[value=Continue")).click();
            boolean isDisplayed = driver.findElement(By.cssSelector("[value=Register")).isDisplayed();
            assertTrue(isDisplayed);

        }
}
