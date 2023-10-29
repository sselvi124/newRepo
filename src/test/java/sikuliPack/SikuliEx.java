package sikuliPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliEx {
	//push from git repository
	//push from eclipse
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("svg[class='gb_h']")).click();
		
		Screen src = new Screen();
		Pattern play = new Pattern("E:\\WECO33\\AdvanceSelenium\\sikiliPractice\\play.png");
		src.click(play);

	}

}
