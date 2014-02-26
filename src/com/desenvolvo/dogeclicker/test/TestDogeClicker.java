package com.desenvolvo.dogeclicker.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDogeClicker {
	public static void main(String[] args) {
		WebDriver firefox = new FirefoxDriver();
		
		firefox.get("http://dogeminer.se/");
		WebElement doge = firefox.findElement(By.id("miner"));
		
		while(true) {
			doge.click();
		}
	}
}
