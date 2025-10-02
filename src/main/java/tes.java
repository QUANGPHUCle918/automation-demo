import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver dv = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        dv.get("https://www.google.com");
        dv.get("https://selectorshub.com/xpath-practice-page/");
        dv.manage().window().maximize();
        Thread.sleep(5000);

        //
        WebElement email = dv.findElement(By.xpath("//input[@placeholder =\"Enter email\"]"));
        email.sendKeys("derpro@gmail.com");
        Thread.sleep(3000);
        email.clear();
        email.sendKeys(" qle25801@email.com");
        Thread.sleep(3000);
        //bước 2
        WebElement password = dv.findElement(By.xpath("//input[@placeholder =\"Enter password\"]"));
        password.sendKeys("12345");
        Thread.sleep(3000);
        password.clear();

        //bước 3
        WebElement company = dv.findElement(By.xpath("//input[@placeholder =\"Enter your company\"]"));
        company.sendKeys("Ngân Hang VCB");
        Thread.sleep(3000);

        //buoc 4
        WebElement phone = dv.findElement(By.xpath("//input[@placeholder =\"Enter your mobile number\"]"));
        phone.sendKeys("0362013427");
        Thread.sleep(3000);

        //buoc5
        WebElement country = dv.findElement(By.xpath("//input[@placeholder =\"Enter your country\"]"));
        country.sendKeys("VIetNAM");
        Thread.sleep(3000);
        //buoc 6
        WebElement sub = dv.findElement(By.xpath("//input[@placeholder =\"Enter your first crush name\"]"));
        sub.click();
        email.clear();




        dv.close();

    }
}
