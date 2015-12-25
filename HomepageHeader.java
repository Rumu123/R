package com.honest.pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomepageHeader {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000L,TimeUnit.SECONDS);
		driver.get("http://www.honest.com");
		

        
		
		//Clicking the Cross button
		
		WebElement CrossButton = driver.findElement(By.xpath(".//*[@id='js-reg-fullscreen-modal']/div[2]/div[1]/button"));
		CrossButton.click();
		
		/*WebElement Bundles = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[1]/a"));
		Bundles.click();
		WebElement Diapering = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[2]/a"));
		Diapering.click();
		WebElement Feeding = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[3]/a"));
		Feeding.click();
		WebElement PersonalCare = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[4]/a"));
		PersonalCare.click();
		WebElement Cleaning = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[5]/a"));
		Cleaning.click();
		WebElement VitaminsAndMore = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[6]/a"));
		VitaminsAndMore.click();
		WebElement GearAndMore = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[7]/a"));
		GearAndMore.click();
		WebElement Gifts = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[8]/a"));
		GearAndMore.click();
		*/
		//Cleaning Navigation
		WebElement CleaNing = driver.findElement(By.xpath(".//*[@id='js-navbar-top']/nav/div/ul/li[5]/a"));
		CleaNing.click();
		WebElement DishSoap = driver.findElement(By.xpath(".//*[@id='grid_product_25']/a[2]"));
		DishSoap.click();
		WebElement QuantityBox = driver.findElement(By.xpath(".//*[@id='js-container-main']/div[3]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/input"));
	    QuantityBox.sendKeys("5");
	}
	

}
