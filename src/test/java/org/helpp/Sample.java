package org.helpp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static WebDriver driver;
	static Actions a;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMax() {
		driver.manage().window().maximize();

	}

	public static void pageUrl(String url) {
		driver.get(url);

	}

	public static String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String pageTitle() {

		String title = driver.getTitle();
		return title;
	}

	public static void fillText(WebElement web, String value) {
		web.sendKeys(value);
	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void clickDouble(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	public static void dragDrop(WebElement src, WebElement tar) {
		a = new Actions(driver);
		a.dragAndDrop(src, tar);

	}

	public static void rightClick(WebElement el) {

		a = new Actions(driver);
		a.contextClick(el).perform();
	}

//	public static void copy() throws AWT exception{
//
//		Robot r = new Robot();
//		r.keypress(keyEvent.VK-CTRL);
//		r.keypress(keyEvent.VK-C);
//		r.keyRElease(keyEvent.VK-CTRL);
//		r.keyrelease(keyEvent.VK-C);
//	}
//	public static String readFromExcel(String sheetName, int rowNum, int cellNum) throws IOException {
//		File f = new File("C:\\Users\\nanaj\\eclipse-workspace\\MavenNewProject\\path\\INFO.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//		Workbook book = new XSSFWorkbook(fis);
//		Sheet sh = book.getSheet(sheetName);
//		Row r = sh.getRow(rowNum);
//		Cell c = r.getCell(cellNum);
//		int type = c.getCellType();
//		String name = "";
//		// ladder if
//		if (type == 1) {
//			name = c.getStringCellValue();
//
//		} else if (DateUtil.isCellDateFormatted(c)) {
//			Date da = c.getDateCellValue();
//			// convert to string
//			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
//			name = s.format(da);
//
//		}
//
//		else {
//			double value = c.getNumericCellValue();
//			// convert to long then string
//			//downcasting ----child ref=(child)par ref;
//			long lo=(long)value;
//			name = String.valueOf(lo);
//			
//
//		}
//		return name;

//	}
	public static void takePic(String picName) {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File f = tss.getScreenshotAs(OutputType.FILE);
		File fi=new File("C:\\Users\\nanaj\\eclipse-workspace\\MavenNewProject\\scrnshot\\"+picName+".png");
		
	}

public static void getDateA() {
	Date d=new Date();
	System.out.println(d);

}

public static void applyImpWat() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


}
