import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("com.MyData", "C:\\Users\\DELL\\OneDrive\\Desktop\\Assi1\\chromedriver\\chromedriver.exe");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("Shoes");
		driver.get("https://www.flipkart.com/search?q=Shoes&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.findElement(By.className("_2r_T1I")).click();
		//driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/ul/li/button")).click();
	}

}
