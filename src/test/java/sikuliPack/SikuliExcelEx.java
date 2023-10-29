package sikuliPack;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliExcelEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
	
		Screen scr = new Screen();
		Pattern miniBar = new Pattern("E:\\WECO33\\AdvanceSelenium\\sikiliPractice\\miniBar.png");
		scr.click(miniBar);

		
		Pattern search = new Pattern("E:\\WECO33\\AdvanceSelenium\\sikiliPractice\\searchBar.png");
		scr.click(search);
		scr.type(search, "Excel");
		
		
//		Robot ro = new Robot();
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
		
//		Pattern excel = new Pattern("E:\\WECO33\\AdvanceSelenium\\sikiliPractice\\excel.png");
//		scr.click(excel);
		
//		Pattern excelCell = new Pattern("E:\\WECO33\\AdvanceSelenium\\sikiliPractice\\excelCell.png");
//		scr.type(excelCell, "Selvi");
	}

}
