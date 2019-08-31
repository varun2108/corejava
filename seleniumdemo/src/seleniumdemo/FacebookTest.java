package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.getTitle();
		
			driver.navigate().to("https://www.google.com/search?source=hp&ei=UVpqXYOPNMX2vgSVvCo&q=quinnox+banglore&oq=quinnox+banglore&gs_l=psy-ab.3...482.565..589...0.0..0.0.0.......0....1..gws-wiz.&safe=active&ssui=on");
			
			driver.navigate().back();
			driver.navigate().refresh();
			
			Thread.sleep(5000);
			
			driver.findElement(By.name("email")).sendKeys("varun.kamma16@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("********");
			driver.findElement(By.id("u_0_a")).click();
			
			
		}


}
