package org.task;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;

public class flipBrowser extends BaseClass {
	public static void main(String[] args) throws InterruptedException{
		launchBrowser("chrome");

		//launchUrl("https://www.flipkart.com/");
		launchUrl("https://www.amazon.in/");

		WebElement src = driver.findElement(By.xpath("//input[@type='text']"));
		src.sendKeys("redmi mobiles");

		WebElement s = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		s.click();

		//List<WebElement> text = driver.findElements(By.xpath("//span[contains(text(),'Red')]"));
		List<WebElement> text = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement x:text) {
			System.out.println(x.getText());
		}

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(WebElement y:price) {
			System.out.println(y.getText());
		}
		

	}
}
