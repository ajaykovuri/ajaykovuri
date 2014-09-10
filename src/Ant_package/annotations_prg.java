package Ant_package;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class annotations_prg<WebElement> {
	WebDriver driver = new FirefoxDriver();
	@Test
	public void open(){
	//System.out.println("@Test");
	driver.get("http://www.flipkartcareers.com/contact-2/open-positions/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<org.openqa.selenium.WebElement>
	System.out.println(list1.size());
	}
	
//	@Test
//	public void open1(){
//	System.out.println("@Test1");
//	}
//	
//	@Before
//	public void before(){
//	System.out.println("@Before");	
//	}
//
//	@After
//	public void after(){
//	System.out.println("@After");
//	}
}
