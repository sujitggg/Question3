import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("com.MyData", "C:\\Users\\DELL\\OneDrive\\Desktop\\Assi1\\chromedriver\\chromedriver.exe");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("Shoes");
		driver.get("https://www.f lipkart.com/search?q=Shoes&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.findElement(By.className("_2r_T1I")).click();
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		driver.findElement(By.className("_2xm1JU")).click();

	}

}
