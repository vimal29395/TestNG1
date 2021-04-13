package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.swing.text.SimpleAttributeSet;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	//Browser Launch
	public static void launchBrowser(String browsername)
	{
		switch(browsername)
		{
		case"chrome":
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\MavenSelenium\\drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
			break;
		case"firefox":
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\MavenSelenium\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case"Ie":
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\MavenSelenium\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		default:
			System.err.println("Invalid Browser");
			break;
		}
	}
	//url launch
	public static void launchUrl(String Url)
	{
		driver.get(Url);
		driver.manage().window().maximize();
	}
	//quit Browser
	public static void quitBrowser() {
		driver.quit();
	}
	//implicit wait
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//sendkeys
	public static void fillTextBox(WebElement e,String value) {
		e.sendKeys(value);
	}
	//click
	public static void btnClick(WebElement e) {
		e.click();
	}
	//Getting url
	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	//get inserted values
	public static String getAttri(WebElement e) {
		return e.getAttribute("value");
	}
	//get text
	public static String getText(WebElement e) {
		return e.getText();
	}
	//get title
	public static String title() {
		String t=driver.getTitle();
		return t;
	}
	//move to Element
	public static void move(WebElement target) {
		Actions a =new Actions(driver);
		a.moveToElement(target).perform();
	}
	//Find element by id
	public static WebElement byId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;	
	}
	//Find element by name
	public static WebElement byName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;	
	}
	//By xpath
	public static WebElement byXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;	
	}
	//select by index
	public static void selectByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	//select by value
	public static void byValue(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	//select by visible text
	public static void visibleText(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	//screenshot
	public static void ss(WebDriver driver,String value) throws IOException {
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File(value);
		FileUtils.copyFile(src, des);
	}
	//drag and drop
	public static void dd(String drag,String drop) {
		Actions a=new Actions(driver);
		WebElement srcbank = driver.findElement(By.xpath(drag));
		WebElement desbank = driver.findElement(By.xpath(drop));
		a.dragAndDrop(srcbank,desbank).perform();
	}
	//scroll down
	public static void scrollDown(String xpath) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement s = driver.findElement(By.xpath(xpath));
		js.executeScript("arguments[0].scrollIntoView(true)", s);
	}
	//scroll up
	public static void scrollUp(String xpath) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement s = driver.findElement(By.xpath(xpath));
		js.executeScript("arguments[0].scrollIntoView(false)", s);
	}
	//js set Attribute
	public static void setAtt(String input,WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+input+"')",e);
	}
	//js get Attribute
	public static void getAtt(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].getAttribute('value')",e);
	}
	//alert accept
	public static void alertAcc() {
		Alert pa = driver.switchTo().alert();
		pa.accept();
	}
	//alert dismiss
	public static void alertDiss() {
		Alert pa = driver.switchTo().alert();
		pa.dismiss();		
	}
	//sendkeys with Enter
	public static void keysClick(WebElement e,String value) {
		e.sendKeys(value,Keys.ENTER);
	}
	public static void clear(WebElement e) {
		e.clear();
	}
	//switch to window2
	public static void window2() {
		String first = driver.getWindowHandle();    //10
		Set<String> both = driver.getWindowHandles(); //10 20
		for(String second:both)
		{
			if(!first.equals(second))    //10!=20
			{
				driver.switchTo().window(second);
			}
		}
	}
	//Switch to window using index
	public static void switchWindow(int index) {
		Set<String> allId = driver.getWindowHandles();
		List<String> l=new LinkedList<>();
		l.addAll(allId);
		driver.switchTo().window(l.get(index));
	}
	//get options
	public static List<WebElement> getopt(WebElement e) {
		Select s=new Select(e);
		List<WebElement> a=s.getOptions();
		List li=new LinkedList();
		for(WebElement all:a)
		{
			String st=all.getText();
			li.add(st);
		}
		return li;	
	}
	//get first selected option
	public static String firstSelect(WebElement e) {
		Select s=new Select(e);
		WebElement r=s.getFirstSelectedOption();
		return r.getText();	
	}
	//get all selected opWebElementtion
	public static List allSel(WebElement e) {
		Select s=new Select(e);
		List<WebElement> a=s.getAllSelectedOptions();
		List li=new LinkedList();
		for(WebElement all:a)
		{
			String st=all.getText();
			li.add(st);
		}
		return li;	
	}
	//double click
	public static void dblClick(WebElement text) {
		Actions a=new Actions(driver);
		a.doubleClick(text).perform();
	}
	//context click 
	public static void rtlClick(WebElement text) {
		Actions a=new Actions(driver);
		a.contextClick(text).perform();
	}
	//Excel
	public static String getExcelData(String sheetName,int rowNo,int cellNo) throws IOException {
		//File
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenSelenium\\src\\test\\resources\\xcel\\Fbbook.xlsx");
		//FileInputStream
		FileInputStream st=new FileInputStream(f);
		//Workbook
		Workbook w=new XSSFWorkbook(st);	
		//Sheet
		Sheet sheet = w.getSheet(sheetName);	
		//row
		Row row = sheet.getRow(rowNo);
		//Cell
		Cell cell = row.getCell(cellNo);
		//cell type
		int type = cell.getCellType();
		String value=null;
		if(type==1)
		{
			value=cell.getStringCellValue();
		}
		else
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
				value=new SimpleDateFormat("dd-MMM-yyy").format(cell.getDateCellValue());
			}
			else
			{
				value=String.valueOf((long)cell.getNumericCellValue());
			}
		
		}
		return value;


	}


}
