package com.crm.Genreicutility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;





public class WebdriverUtility {

	public void maximizWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	public void rightClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	public void scrollToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	public void switchToWindow(WebDriver driver, String url) {
		Set<String> windowids = driver.getWindowHandles();
		for(String id :windowids) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(url)) {
				break;
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
