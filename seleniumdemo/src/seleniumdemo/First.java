package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("quinnox banglore");
		
		driver.findElement(By.name("btnK")).submit();
		
		driver.navigate().to("https://www.google.com/search?source=hp&ei=UVpqXYOPNMX2vgSVvCo&q=quinnox+banglore&oq=quinnox+banglore&gs_l=psy-ab.3...482.565..589...0.0..0.0.0.......0....1..gws-wiz.&safe=active&ssui=on");
		

	}

}
