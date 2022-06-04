package tdgdgdgdg.dgdgdgd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("XDs");
		String nome = "https://ge.globo.com/";
		String browser = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Acer\\Desktop\\dgdgdgd\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary(browser);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get(nome);
		WebElement inputPesquisa =
				driver.findElement(By.id("buscar-campo"));
		inputPesquisa.sendKeys("futebol");
		inputPesquisa.sendKeys(Keys.RETURN);	
		
		
	}

}
