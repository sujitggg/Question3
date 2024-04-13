import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("com.MyData", "C:\\Users\\DELL\\OneDrive\\Desktop\\Assi1\\chromedriver\\chromedriver.exe");
		driver.get("https://www.flipkart.com/account/login?signup=true");
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("9096960273");

	}

}
