import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintro {
	
	public static void main(String[] args) {
		
		//Invoking the browser
		
		System.setProperty("webdriver.chrome.driver","C:/Users/sujpa/git/sel-java/selenium-start/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //ChromeDriver driver = new ChromeDriver();
		driver.get("https://sujpa.qtestnet.com");
		driver.getTitle();
		driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
}
