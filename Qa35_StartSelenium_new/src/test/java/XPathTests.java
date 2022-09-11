import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XPathTests {

    WebDriver wd;

    @Test
    public void xPathTests(){
        wd = new ChromeDriver();
        wd.manage().window().maximize(); //open full screen
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        //open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();

        //fill email ....Nik@gmail.com	(password 123589$Nik)
        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("Nik@gmail.com");

        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("123589$Nik");

        // submit login
        WebElement loginButton = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginButton.click();







    }
}
