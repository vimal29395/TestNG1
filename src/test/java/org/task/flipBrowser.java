package org.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
		System.out.println("page1");
		List<WebElement> text = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int st = text.size();
		System.out.println(st);
		for(WebElement x:text) {
			System.out.println(x.getText());
		}

		List<WebElement> price1 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int rt = price1.size();
		System.out.println(rt);
		for(WebElement y:price1) {
			System.out.println(y.getText());
		}
		//		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//		int rt = price.size();
		//		System.out.println(rt);
		//		List<Integer> li=new ArrayList<>();
		//		for(WebElement y:price) {
		//			String t= y.getText();
		//			int v = Integer.parseInt(t);
		//
		//			li.add(v);
		//			if(li.contains(v)) {
		//				String a = t.replace(",","");
		//				//String a = t.replaceAll(",", "");
		//				int b = Integer.parseInt(a);
		//				System.out.println(b);
		//			}
		//
		//			Collections.sort(li);
		//		}
		//		System.out.println(li);
		System.out.println("page2");
		WebElement page2 = driver.findElement(By.xpath("//li[@class='a-last']"));
		page2.click();
		Thread.sleep(2000);
		List<WebElement> ab = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int aa = ab.size();
		System.out.println(aa);
		for(WebElement x:ab) {
			System.out.println(x.getText());
		}
		
		List<WebElement> price2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int vt = price2.size();
		System.out.println(vt);
		for(WebElement y:price2) {
			System.out.println(y.getText());
		}
		
		System.out.println("page3");
		WebElement page3 = driver.findElement(By.xpath("//li[@class='a-last']"));
		page3.click();
		Thread.sleep(2000);
		List<WebElement> bc = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int bb = bc.size();
		System.out.println(bb);
		for(WebElement x:bc) {
			System.out.println(x.getText());
		}
		
		List<WebElement> price3 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int gt = price3.size();
		System.out.println(gt);
		for(WebElement y:price3) {
			System.out.println(y.getText());
		
		}
		

	}
}
