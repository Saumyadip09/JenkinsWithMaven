package com.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		WebDriver driver = new FirefoxDriver();
		driver.findElement(By.xpath(""));

	}

}
